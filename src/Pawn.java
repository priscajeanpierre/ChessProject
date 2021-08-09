import javax.swing.*;

public class Pawn extends Piece
{
    public Pawn(Boolean isBlackPlayer)
    {
        super(isBlackPlayer);


        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer)
        {
            image = new ImageIcon("bpawn.gif");
        }
        else
        {
            image = new ImageIcon("wpawn.gif");
        }
    }


}
