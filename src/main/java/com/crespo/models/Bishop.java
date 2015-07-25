package com.crespo.models;

import com.crespo.models.utils.PieceColour;
import com.crespo.models.utils.PieceType;
import com.crespo.models.utils.Position;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author john 
 * @description cardinal points N,S,E,W e.g NW = north-west
 */
public class Bishop extends Piece {

    public Bishop() {

    }

    public Bishop(PieceColour colour, PieceType type) {
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
        
        /* NE move*/
        while(getX() + i < Board.length && getY() + i < Board.length){
            if ((abs(getX() - (getX() + i)) == abs(getY() - (getY() + i)))) { //validate whether the move is on the diagonal
                //validate whether there are piece on the way
                try {
                    if (board.isCellEmpty(getX() + i, getY() + i)) {
                         validMoves.add(String.valueOf(Position.getPosition(getX() + i, getY() + i)).toLowerCase());
                         i++;
                    } else {
                        if(board.CheckBoardPieceColour(getX() + i, getY() + i).equals(getColor())){
                            i = Board.length;
                        }else{
                            validMoves.add(String.valueOf(Position.getPosition(getX() + i, getY() + i)).toLowerCase());
                            i = Board.length;
                        }
                    }
                } catch (Exception e) {
                    i = Board.length;
                }
            }
        }

        /* NW move*/
        i = 1;
        while (getX() - i >= 0 && getY() + i < Board.length){
            if ((abs(getX() - (getX() + i)) == abs(getY() - (getY() + i)))) { //validate whether the move is diagonal
                //validate whether there are piece on the way
                try {
                    if (board.isCellEmpty(getX() - i, getY() + i)) {
                         validMoves.add(String.valueOf(Position.getPosition(getX() - i, getY() + i)).toLowerCase());
                         i++;
                    } else {
                        if(board.CheckBoardPieceColour(getX() - i, getY() + i).equals(getColor())){
                            i = Board.length;
                        }else{
                            validMoves.add(String.valueOf(Position.getPosition(getX() - i, getY() + i)).toLowerCase());
                            i = Board.length;
                        }
                    }
                } catch (Exception e) {
                    i = Board.length;
                    //logger
                }
            }
        }


        /* SE move */
        i = 1;
        while (getX() + i < Board.length && getY() - i >= 0){
            if ((abs(getX() - (getX() + i)) == abs(getY() - (getY() + i)))) { //validate whether the move is diagonal
                //validate whether there are piece on the way
                try {
                    if (board.isCellEmpty(getX() + i, getY() - i)) {
                         validMoves.add(String.valueOf(Position.getPosition(getX() + i, getY() - i)).toLowerCase());
                         i++;
                    } else {
                        if(board.CheckBoardPieceColour(getX() + i, getY() - i).equals(getColor())){
                            i = Board.length;
                        }else{
                            validMoves.add(String.valueOf(Position.getPosition(getX() + i, getY() - i)).toLowerCase());
                            i = Board.length;
                        }
                    }
                } catch (Exception e) {
                    i = Board.length;
                    //logger
                }
            }
        }

        /* SW move*/
        i = 1;
        while (getX() - i >= 0 && getY() - i >= 0){
            if ((abs(getX() - (getX() + i)) == abs(getY() - (getY() + i)))) { //validate whether the move is diagonal
                //validate whether there are piece on the way
                try {
                    if (board.isCellEmpty(getX() - i, getY() - i)) {
                         validMoves.add(String.valueOf(Position.getPosition(getX() - i, getY() - i)).toLowerCase());
                         i++;
                    } else {
                        if(board.CheckBoardPieceColour(getX() - i, getY() - i).equals(getColor())){
                            i = Board.length;
                        }else{
                            validMoves.add(String.valueOf(Position.getPosition(getX() - i, getY() - i)).toLowerCase());
                            i = Board.length;
                        }
                    }
                } catch (Exception e) {
                    i = Board.length;
                    //logger
                }
            }
        }
        Collections.sort(validMoves);
        setValidMoves(validMoves);
    }

}
