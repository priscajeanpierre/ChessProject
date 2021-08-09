import javax.swing.*;

public class Chess
{

    public static final int pieceSize = 44;
    public static final int HEIGHT = pieceSize*8  , WIDTH = pieceSize*8;
    public static BoardComponent boardComponent;
    public static Piece[][] position = new Piece[8][8];
    public static void main(String[] args )
    {
        //make pieces here
            //this makes a knight object and places it in the array x=1,y=0
        //Knights
        position[1][0] = new Knight(true);
        position[6][0] = new Knight(true);
        position[1][7] = new Knight(false);
        position[6][7] = new Knight(false);

        //bishops
        position[2][0] = new Bishop(true);
        position[5][0] = new Bishop(true);
        position[2][7] = new Bishop(false);
        position[5][7] = new Bishop(false);

        //Rooks
        position[0][0] = new Rook(true);
        position[7][0] = new Rook(true);
        position[0][7] = new Rook(false);
        position[7][7] = new Rook(false);

        //Queens
        position[4][0] = new Queen(true);
        position[4][7] = new Queen(false);

        //Kings
        position[3][0] = new King(true);
        position[3][7] = new King(false);

        //Pawns
       position[0][1] = new Pawn(true);
       position[1][1] = new Pawn(true);
       position[2][1] = new Pawn(true);
       position[3][1] = new Pawn(true);
       position[4][1] = new Pawn(true);
       position[5][1] = new Pawn(true);
       position[6][1] = new Pawn(true);
       position[7][1] = new Pawn(true);

        position[0][6] = new Pawn(false);
        position[1][6] = new Pawn(false);
        position[2][6] = new Pawn(false);
        position[3][6] = new Pawn(false);
        position[4][6] = new Pawn(false);
        position[5][6] = new Pawn(false);
        position[6][6] = new Pawn(false);
        position[7][6] = new Pawn(false);






        //make the window
        JFrame window = new JFrame("Chess");
        //10,40 makes window slightly bigger to adjust for title bar, boarders
        window.setSize(WIDTH+10,HEIGHT+40);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //make a board component object add it to the window
        boardComponent = new BoardComponent();
        BoardMouseListener mouseListener = new BoardMouseListener();
        boardComponent.addMouseListener(mouseListener);
        //will respond to press and release methods
        window.add(boardComponent);



        window.setVisible(true);

    }
}
