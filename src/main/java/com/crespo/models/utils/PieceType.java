
package com.crespo.models.utils;

/**
 *
 * @author john
 */
public enum PieceType {
    
    BISHOP ("B"),
    KNIGHT ("N"),
    ROOK ("R"),
    QUEEN ("Q");
    
    private final String name;

    private PieceType(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    
}
