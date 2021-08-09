import javax.swing.*;
import java.awt.*;

public class BoardComponent extends JComponent
{
    protected void paintComponent(Graphics g) {
        //draw the 64 tiles

        //make a color
        Color lightBrown = new Color(233, 174, 95);
        Color darkBrown = new Color(177, 113, 24);
        //64 tiles
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
                    g.setColor(lightBrown);
                } else {
                    g.setColor(darkBrown);
                }
                g.fillRect(x * Chess.pieceSize, y * Chess.pieceSize, Chess.pieceSize, Chess.pieceSize);
            }
        }

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (Chess.position[x][y] != null) {

                    g.drawImage(Chess.position[x][y].image.getImage(), x * Chess.pieceSize, y * Chess.pieceSize, null);
                }

            }
        }


        //draw a single tile at top left corner
        //use fillRect: needs top left corner, width, height
        //top left: 0,0 width: Chess.piece size

//       //black pieces
//
//        //Knights
//        ImageIcon bKnightIcon = new ImageIcon("bknight.gif");
//        g.drawImage(bKnightIcon.getImage(), Chess.pieceSize, 0,null);
//        g.drawImage(bKnightIcon.getImage(),6*Chess.pieceSize, 0,null);
//
//        //rooks
//        ImageIcon bRooks = new ImageIcon("brook.gif");
//        g.drawImage(bRooks.getImage(), 0, 0,null);
//        g.drawImage(bRooks.getImage(),7*Chess.pieceSize, 0,null);
//
//        //bishops
//        ImageIcon bBishops = new ImageIcon("bbishop.gif");
//        g.drawImage(bBishops.getImage(),2*Chess.pieceSize, 0,null);
//        g.drawImage(bBishops.getImage(),5*Chess.pieceSize, 0,null);
//
//        //bKing
//        ImageIcon bKing = new ImageIcon("bking.gif");
//        g.drawImage(bKing.getImage(),3*Chess.pieceSize, 0,null);
//
//        //bQueen
//        ImageIcon bQueen = new ImageIcon("bqueen.gif");
//        g.drawImage(bQueen.getImage(),4*Chess.pieceSize, 0,null);
//
//        //8 bpawns
//        for (int i = 0; i < 8; i++)
//        {
//            ImageIcon bPawn = new ImageIcon("bpawn.gif");
//            g.drawImage(bPawn.getImage(),i*Chess.pieceSize, Chess.pieceSize,null);
//
//        }
//
//
//        //white pieces
//
//        //wRooks
//        ImageIcon image = new ImageIcon("wrook.gif");
//        g.drawImage(image.getImage(), 0,7*44,null);
//        g.drawImage(image.getImage(),7*44,7*44,null);
//
//        //wKnights
//        ImageIcon wKnight = new ImageIcon("wknight.gif");
//        g.drawImage(wKnight.getImage(), Chess.pieceSize,7*Chess.pieceSize,null);
//        g.drawImage(wKnight.getImage(),6*Chess.pieceSize,7*Chess.pieceSize,null);
//
//        //wBishops
//        ImageIcon wBishops = new ImageIcon("wbishop.gif");
//        g.drawImage(wBishops.getImage(),2*Chess.pieceSize,7*Chess.pieceSize,null);
//        g.drawImage(wBishops.getImage(),5*Chess.pieceSize,7*Chess.pieceSize,null);
//
//        //wKing
//        ImageIcon wKing = new ImageIcon("wking.gif");
//        g.drawImage(wKing.getImage(),3*Chess.pieceSize,7*Chess.pieceSize,null);
//
//        //wQueen
//        ImageIcon wQueen = new ImageIcon("wqueen.gif");
//        g.drawImage(wQueen.getImage(),4*Chess.pieceSize,7*Chess.pieceSize,null);
//
//        //8 wPawns
//        for (int i = 0; i < 8; i++)
//        {
//            ImageIcon wPawn = new ImageIcon("wpawn.gif");
//            g.drawImage(wPawn.getImage(),i*Chess.pieceSize,6*Chess.pieceSize,null);
//
//        }

    }}









