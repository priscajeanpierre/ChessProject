import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoardMouseListener implements MouseListener
{
    int startx, starty;
    int endx;
    int endy;


    public void mousePressed(MouseEvent e)
    {
        System.out.println("mouse pressed");

        //store where mouse pressed on board
        int pressx = e.getX()/Chess.pieceSize;
        //pixels to squares on board
        startx = pressx;

        //store where mouse pressed on board
        int pressy = e.getY()/Chess.pieceSize;
        //pixels to squares on board
        starty = pressy;


    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

        System.out.println("mouse released");
        //releases where mouse pressed on board
        endx = e.getX()/Chess.pieceSize;
        endy = e.getY()/Chess.pieceSize;


        //keeping mouse pressed within bounds of board
        if (startx < 0 || startx > 7 || starty < 0 || starty > 7)
        {
            return;
        }

        if (endx > 7 || endx < 0 || endy > 7 || endy < 0)
        {
            return;
        }

        if (Chess.position[endx][endy] != null && Chess.position[endx][endy].isBlackPlayer)
        {
            return;
        }
        if (startx==endx&&starty==endy)
        {
            return;
        }
        if (Chess.position[startx][starty]==null)
        {
            return;
        }
        if (!Chess.position[startx][starty].canMove(startx, starty, endx, endy))
        {
            return;
        }
        if (Chess.position[startx][starty].isBlackPlayer)
        {
            return;
        }


        Chess.position[endx][endy] = Chess.position[startx][starty];
        //makes old position set to null
        Chess.position[startx][starty]=null;
        Chess.boardComponent.repaint();


        while (true)
        {

            startx = (int)(Math.random()*8);
            starty = (int)(Math.random()*8);
            endx = (int)(Math.random()*8);
            endy = (int)(Math.random()*8);


            if (Chess.position[startx][starty]==null)
            {
                continue;
            }
            if (startx == endx && starty == endy)
            {
                continue;
            }
            if (!Chess.position[startx][starty].isBlackPlayer)
            {
                continue;
            }

            Chess.position[endx][endy] = Chess.position[startx][starty];
            //makes old position set to null
            Chess.position[startx][starty]=null;
            Chess.boardComponent.repaint();
            break;

        }

    }



    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}

