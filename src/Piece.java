import javax.swing.*;
import java.awt.*;

public abstract class Piece
{
    protected ImageIcon image;
    protected boolean isBlackPlayer;



    public Piece(boolean color)
    {
        if (color)
        {
            isBlackPlayer = true;
        }
        else
        {
            isBlackPlayer = false;
        }


    }

    public void drawPiece(int x, int y, Graphics g)
    {
        g.drawImage(image.getImage(),x*Chess.pieceSize,y*Chess.pieceSize,null);
    }

    public boolean canMove(int startx, int starty, int endx, int endy)
    {
        return true;
    }


    }

