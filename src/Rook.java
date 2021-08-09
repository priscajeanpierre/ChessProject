import javax.swing.*;

public class Rook extends Piece
{
    public Rook(Boolean isBlackPlayer)
    {
        super(isBlackPlayer);


        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer == true)
        {
            image = new ImageIcon("brook.gif");
        }
        else
        {
            image = new ImageIcon("wrook.gif");
        }
    }


}
