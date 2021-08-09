import javax.swing.*;

public class King extends Piece
{
    public King(Boolean isBlackPlayer)
    {
        super(isBlackPlayer);


        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer == true)
        {
            image = new ImageIcon("bking.gif");
        }
        else
        {
            image = new ImageIcon("wking.gif");
        }
    }


}
