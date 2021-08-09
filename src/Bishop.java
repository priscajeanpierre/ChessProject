import javax.swing.*;

public class Bishop extends Piece
{
    public Bishop(Boolean isBlackPlayer)
    {
        super(isBlackPlayer);


        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer == true)
        {
            image = new ImageIcon("bbishop.gif");
        }
        else
        {
            image = new ImageIcon("wbishop.gif");
        }
    }


}
