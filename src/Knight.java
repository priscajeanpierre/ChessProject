import javax.swing.*;

public class Knight extends Piece
{
    public Knight(Boolean isBlackPlayer)
    {
        super(isBlackPlayer);


        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer == true)
        {
             image = new ImageIcon("bknight.gif");
        }
        else
        {
             image = new ImageIcon("wknight.gif");
        }
    }


}
