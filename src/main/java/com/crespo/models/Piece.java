package com.crespo.models;

import com.crespo.models.utils.PieceColour;
import com.crespo.models.utils.PieceType;
import java.util.List;

/**
 *
 * @author john
 */
public abstract class Piece {

    private PieceColour color;
    private PieceType type;
    private List<String> validMoves;
    private int x = 0; //x-axis
    private int y = 0; //y-axis

    public Piece() {
    }

    public Piece(PieceColour color, PieceType type) {
        this.color = color;
        this.type = type;
    }

    //abstract method which calculate valid moves for subclasses (bishop, knights,etc..))
    abstract public void ValidMoves(Board board);

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the color
     */
    public PieceColour getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(PieceColour color) {
        this.color = color;
    }

    /**
     * @return the type
     */
    public PieceType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(PieceType type) {
        this.type = type;
    }

    /**
     * @return the validMoves
     */
    public List<String> getValidMoves() {
        return validMoves;
    }

    /**
     * @param validMoves the validMoves to set
     */
    public void setValidMoves(List<String> validMoves) {
        this.validMoves = validMoves;
    }

}
