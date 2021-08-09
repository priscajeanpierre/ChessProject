import javax.swing.*;

public class Queen extends Piece
{
    public Queen(Boolean isBlackPlayer)
    {
        super(isBlackPlayer);
        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer == true)
        {
            image = new ImageIcon("bqueen.gif");
        }
        else
        {
            image = new ImageIcon("wqueen.gif");
        }
    }


}
