
package com.crespo.models.utils;

/**
 *
 * @author john
 */
public enum Position {
    
    a1 ("a1",0,0), a2 ("a2",0,1), a3 ("a3",0,2), a4 ("a4",0,3), a5 ("a5",0,4), a6 ("a6",0,5), a7 ("a7",0,6), a8 ("a8",0,7),
    b1 ("b1",1,0), b2 ("b2",1,1), b3 ("b3",1,2), b4 ("b4",1,3), b5 ("b5",1,4), b6 ("b6",1,5), b7 ("b7",1,6), b8 ("b8",1,7), 
    c1 ("c1",2,0), c2 ("c2",2,1), c3 ("c3",2,2), c4 ("c4",2,3), c5 ("c5",2,4), c6 ("c6",2,5), c7 ("c7",2,6), c8 ("c8",2,7), 
    d1 ("d1",3,0), d2 ("d2",3,1), d3 ("d3",3,2), d4 ("d4",3,3), d5 ("d5",3,4), d6 ("d6",3,5), d7 ("d7",3,6), d8 ("d8",3,7),
    e1 ("e1",4,0), e2 ("e2",4,1), e3 ("e3",4,2), e4 ("e4",4,3), e5 ("e5",4,4), e6 ("e6",4,5), e7 ("e7",4,6), e8 ("e8",4,7),
    f1 ("f1",5,0), f2 ("f2",5,1), f3 ("f3",5,2), f4 ("f4",5,3), f5 ("f5",5,4), f6 ("f6",5,5), f7 ("f7",5,6), f8 ("f8",5,7),
    g1 ("g1",6,0), g2 ("g2",6,1), g3 ("g3",6,2), g4 ("g4",6,3), g5 ("g5",6,4), g6 ("g6",6,5), g7 ("g7",6,6), g8 ("g8",6,7),
    h1 ("h1",7,0), h2 ("h2",7,1), h3 ("h3",7,2), h4 ("h4",7,3), h5 ("h5",7,4), h6 ("h6",7,5), h7 ("h7",7,6), h8 ("h8",7,7);
    
    private final String name;
    private final int x;
    private final int y;
    
    
    Position(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public static Position getPosition(int x, int y) {
        for (Position position: Position.values()) {
            if (x == position.getX() && y == position.getY())
                return position;
        }
        return null;
    }
}
