
package com.crespo.models.utils;

import com.crespo.models.Bishop;
import com.crespo.models.Knight;
import com.crespo.models.Piece;
import com.crespo.models.Queen;
import com.crespo.models.Rook;

/**
 *
 * @author john
 */
public class PieceFactory {

    public Piece getPiece(PieceType type, PieceColour color){
        if(type.equals(PieceType.BISHOP)){
            return new Bishop(color,type);
        }
        
        if(type.equals(PieceType.KNIGHT)){
            return new Knight(color, type);
        }
        
        if(type.equals(PieceType.ROOK)){
            return new Rook(color, type);
        }
        
        if(type.equals(PieceType.QUEEN)){
            return new Queen(color, type);
        }
        
        return null;
    }
}
