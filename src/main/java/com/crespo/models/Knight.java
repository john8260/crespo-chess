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
public class Knight extends Piece {

    public Knight() {

    }

    public Knight(PieceColour colour, PieceType type) {
        super(colour, type);
    }
    
    /*
        This could be improved by creating a class receiver which makes the specific moves 
        e.g diagonal,horizontal, vertical, L shape (Command design pattern)
    */
    @Override
    public void ValidMoves(Board board) { 
        List<String> validMoves = new ArrayList<>();

        //2W, 1S move
        if ((getX() - 2 >= 0 && getX() - 2 <= 7) && (getY() - 1 >= 0 && getY() - 1 <= 7)) {
            if (board.isCellEmpty(getX() - 2, getY() - 1)) {
                validMoves.add(String.valueOf(Position.getPosition(getX() - 2, getY() - 1)).toLowerCase());
            } else {
                if (!board.CheckBoardPieceColour(getX() - 2, getY() - 1).equals(getColor())) {
                    validMoves.add(String.valueOf(Position.getPosition(getX() - 2, getY() - 1)).toLowerCase());
                }
            }
        }
        //2W, 1N move
        if ((getX()-2>=0 && getX()-2<=7) && (getY()+1>=0 && getY()+1<=7)){
            if (board.isCellEmpty(getX() - 2, getY() + 1)) {
                validMoves.add(String.valueOf(Position.getPosition(getX()-2, getY()+1)).toLowerCase());
            } else {
                if (!board.CheckBoardPieceColour(getX() - 2, getY() + 1).equals(getColor())) {
                    validMoves.add(String.valueOf(Position.getPosition(getX()-2, getY()+1)).toLowerCase());
                }
            }            
        }
            
        //1W, 2N move
        if ((getX()-1>=0 && getX()-1<=7) && (getY()+2>=0 && getY()+2<=7)){
            if (board.isCellEmpty(getX() - 1, getY() + 2)) {
                validMoves.add(String.valueOf(Position.getPosition(getX()-1, getY()+2)).toLowerCase());
            } else {
                if (!board.CheckBoardPieceColour(getX() - 1, getY() + 2).equals(getColor())) {
                    validMoves.add(String.valueOf(Position.getPosition(getX()-1, getY()+2)).toLowerCase());
                }
            }             
        }
            
        //1E, 2N
        if ((getX()+1>=0 && getX()+1<=7) && (getY()+2>=0 && getY()+2<=7)){
            if (board.isCellEmpty(getX() + 1, getY() + 2)) {
                validMoves.add(String.valueOf(Position.getPosition(getX()+1, getY()+2)).toLowerCase());
            } else {
                if (!board.CheckBoardPieceColour(getX() + 1, getY() + 2).equals(getColor())) {
                    validMoves.add(String.valueOf(Position.getPosition(getX()+1, getY()+2)).toLowerCase());
                }
            }            
        }
        //2E, 1N
        if ((getX() + 2 >= 0 && getX() + 2 <= 7) && (getY() + 1 >= 0 && getY() + 1 <= 7)) {
            if (board.isCellEmpty(getX() + 2, getY() + 1)) {
                validMoves.add(String.valueOf(Position.getPosition(getX() + 2, getY() + 1)).toLowerCase());
            } else {
                if (!board.CheckBoardPieceColour(getX() + 2, getY() + 1).equals(getColor())) {
                    validMoves.add(String.valueOf(Position.getPosition(getX() + 2, getY() + 1)).toLowerCase());
                }
            }
        }

        //2E, 1S
        if ((getX() + 2 >= 0 && getX() + 2 <= 7) && (getY() - 1 >= 0 && getY() - 1 <= 7)) {
            if (board.isCellEmpty(getX() + 2, getY() - 1)) {
                validMoves.add(String.valueOf(Position.getPosition(getX() + 2, getY() - 1)).toLowerCase());
            } else {
                if (!board.CheckBoardPieceColour(getX() + 2, getY() - 1).equals(getColor())) {
                    validMoves.add(String.valueOf(Position.getPosition(getX() + 2, getY() - 1)).toLowerCase());
                }
            }
        }

        //1E, 2S
        if ((getX() + 1 >= 0 && getX() + 1 <= 7) && (getY() - 2 >= 0 && getY() - 2 <= 7)) {
            if (board.isCellEmpty(getX() + 1, getY() - 2)) {
                validMoves.add(String.valueOf(Position.getPosition(getX() + 1, getY() - 2)).toLowerCase());
            } else {
                if (!board.CheckBoardPieceColour(getX() + 1, getY() - 2).equals(getColor())) {
                    validMoves.add(String.valueOf(Position.getPosition(getX() + 1, getY() - 2)).toLowerCase());
                }
            } 
        }

        //1W, 2S
        if ((getX() - 1 >= 0 && getX() - 1 <= 7) && (getY() - 2 >= 0 && getY() - 2 <= 7)) {
            if (board.isCellEmpty(getX() - 1, getY() - 2)) {
                validMoves.add(String.valueOf(Position.getPosition(getX() - 1, getY() - 2)).toLowerCase());
            } else {
                if (!board.CheckBoardPieceColour(getX() - 1, getY() - 2).equals(getColor())) {
                    validMoves.add(String.valueOf(Position.getPosition(getX() - 1, getY() - 2)).toLowerCase());
                }
            } 
        }
        Collections.sort(validMoves);
        setValidMoves(validMoves);
    }

}
