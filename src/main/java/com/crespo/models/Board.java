
package com.crespo.models;

import com.crespo.models.utils.PieceColour;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author john
 */
public class Board {
    
    public static final int length = 8;
    
    private  List<Piece> pieces;

    public Board(){
        this.pieces = new ArrayList<>();
    }
    
    //method to find out whether there is a piece on a particular square
    public boolean isCellEmpty(int x, int y) {
        for (Piece piece : pieces){
            if (piece.getX() == x && piece.getY() == y) {
                return false;
            }
        }
        return true;
    }
    
    public PieceColour CheckBoardPieceColour(int x, int y){
        for(Piece piece : pieces){
            if (piece.getX() == x && piece.getY() == y) {
                return piece.getColor();
            }
        }
        return null;
    }

    /**
     * @return the pieces
     */
    public List<Piece> getPieces() {
        return pieces;
    }

    /**
     * @param pieces the pieces to set
     */
    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }


}
