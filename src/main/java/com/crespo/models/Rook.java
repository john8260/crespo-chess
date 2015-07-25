
package com.crespo.models;

import com.crespo.models.utils.PieceColour;
import com.crespo.models.utils.PieceType;
import com.crespo.models.utils.Position;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author john
 */
public class Rook extends Piece{
    
    public Rook(){
    }
    
    public Rook(PieceColour colour, PieceType type) {
        super(colour, type);
    }

    /*
        This could be improved by creating a class receiver which makes the specific moves 
        e.g diagonal,horizontal, vertical, L shape (Command design pattern)
    */
    @Override
    public void ValidMoves(Board board) { 
        List<String> validMoves = new ArrayList<>();
        int i = 1;
       
        //E move
        while(getX() + i < Board.length){
            if (getX() != (getX() + i)) { //validate whether the move is horizontal
                //validate whtehter there are pieces on the way
                try {
                    if (board.isCellEmpty(getX() + i, getY())) {
                         validMoves.add(String.valueOf(Position.getPosition(getX() + i, getY())).toLowerCase());
                         i++;
                    } else {
                        if(board.CheckBoardPieceColour(getX() + i, getY()).equals(getColor())){
                            i = Board.length;
                        }else{
                            validMoves.add(String.valueOf(Position.getPosition(getX() + i, getY())).toLowerCase());
                            i = Board.length;
                        }
                    }
                } catch (Exception e) {
                    i = Board.length;
                }
            }
        }
        
        //W move
        i = 1;
        while(getX() - i >= 0){
            if (getX() != (getX() - i)) { //validate whether the move is horizontal
                //validate whtehter there are pieces on the way
                try {
                    if (board.isCellEmpty(getX() - i, getY())) {
                         validMoves.add(String.valueOf(Position.getPosition(getX() - i, getY())).toLowerCase());
                         i++;
                    } else {
                        if(board.CheckBoardPieceColour(getX() - i, getY()).equals(getColor())){
                            i = Board.length;
                        }else{
                            validMoves.add(String.valueOf(Position.getPosition(getX() - i, getY())).toLowerCase());
                            i = Board.length;
                        }
                    }
                } catch (Exception e) {
                    i = Board.length;
                }
            }
        }
        
        //N move
        i = 1;
        while(getY() + i < Board.length){
            if (getY() != (getY() + i)) { //validate whether the move is vertical
                //validate whether there are pieces on the way
                try {
                    if (board.isCellEmpty(getX(), getY() + i)) {
                         validMoves.add(String.valueOf(Position.getPosition(getX(), getY() + i)).toLowerCase());
                         i++;
                    } else {
                        if(board.CheckBoardPieceColour(getX(), getY() + i).equals(getColor())){
                            i = Board.length;
                        }else{
                            validMoves.add(String.valueOf(Position.getPosition(getX(), getY() + i)).toLowerCase());
                            i = Board.length;
                        }
                    }
                } catch (Exception e) {
                    i = Board.length;
                }
            }
        }
        //S move
        i = 1;
        while(getY() - i >= 0){
            if (getY() != (getY() - i)) { //validate whether the move is vertical
                //validate whether there are pieces on the way
                try {
                    if (board.isCellEmpty(getX(), getY() - i)) {
                         validMoves.add(String.valueOf(Position.getPosition(getX(), getY() - i)).toLowerCase());
                         i++;
                    } else {
                        if(board.CheckBoardPieceColour(getX(), getY() - i).equals(getColor())){
                            i = Board.length;
                        }else{
                            validMoves.add(String.valueOf(Position.getPosition(getX(), getY() - i)).toLowerCase());
                            i = Board.length;
                        }
                    }
                } catch (Exception e) {
                    i = Board.length;
                }
            }
        }
        
        Collections.sort(validMoves);
        setValidMoves(validMoves);
    }

}
