package com.crespo.crespochess.utils;

import static java.lang.Math.abs;

/**
 *
 * @author john
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        int x = 3; 
        int y = 3; 
        int i;
        /*---------------------------------------------------Test for rooks-----------------------------------*/
        //E move
        for (i = 1; x + i < board.length; i++) {
            if (x != (x + i)) { //validate whether the move is horizontal
                board[x + i][y] = 1;
                System.out.println("x:" + (x + i) + "  y:" + (y));
            }
        }
        
        //W move
        for (i = 1; x - i >= 0; i++) {
            if (x != (x - i)) { //validate whether the move is horizontal
                board[x - i][y] = 1;
                System.out.println("x:" + (x - i) + "  y:" + (y));
            }
        }
        
        //N move
        for (i = 1; y + i < board.length; i++) {
            if (y != (y + i)) { //validate whether the move is vertical
                board[x][y + i] = 1;
                System.out.println("x:" + (x) + "  y:" + (y + i));
            }
        }
        
        //S move
        for (i = 1; y - i >= 0; i++) {
            if (y != (y - i)) { //validate whether the move is vertical
                board[x][y - i] = 1;
                System.out.println("x:" + (x) + "  y:" + (y - i));
            }
        }

        /*--------------------------------------------------Test for Knights----------------------------------*/
//        //2W, 1S move
//        if ((x-2>=0 && x-2<=7) && (y-1>=0 && y-1<=7)){
//            board[x-2][y-1] = 1;
//            System.out.println("x:" + (x - 2) + "  y:" + (y - 1));
//        }
//            
//        //2W, 1N move
//        if ((x-2>=0 && x-2<=7) && (y+1>=0 && y+1<=7)){
//            board[x-2][y+1] = 1;
//            System.out.println("x:" + (x - 2) + "  y:" + (y + 1));
//        }
//            
//        //1W, 2N move
//        if ((x-1>=0 && x-1<=7) && (y+2>=0 && y+2<=7)){
//            board[x-1][y+2] = 1;
//            System.out.println("x:" + (x - 1) + "  y:" + (y + 2));
//        }
//            
//        //1E, 2N move
//        if ((x+1>=0 && x+1<=7) && (y+2>=0 && y+2<=7)){
//            board[x+1][y+2] =1;
//            System.out.println("x:" + (x + 1) + "  y:" + (y + 2));
//        }
//            
//        //2E, 1N move
//        if ((x+2>=0 && x+2<=7) && (y+1>=0 && y+1<=7)){
//            board[x+2][y+1] = 1;
//            System.out.println("x:" + (x + 2) + "  y:" + (y + 1));
//        }
//            
//        //2E, 1S move
//         if ((x+2>=0 && x+2<=7) && (y-1>=0 && y-1<=7)){
//             board[x+2][y-1] = 1;
//             System.out.println("x:" + (x + 2) + "  y:" + (y -1));
//         }
//             
//         //1E, 2S move
//         if ((x+1>=0 && x+1<=7) && (y-2>=0 && y-2<=7)){
//             board[x+1][y-2] = 1;
//             System.out.println("x:" + (x + 1) + "  y:" + (y - 2));
//         }
//             
//         //1W, 2S move
//         if ((x-1>=0 && x-1<=7) && (y-2>=0 && y-2<=7)){
//             board[x-1][y-2] =1;
//             System.out.println("x:" + (x - 1) + "  y:" + (y - 2));
//         }
             
/*----------------------------------------------Test for Bishops-------------------------------------*/

//        /* NE moves*/
//        for (i = 1; x + i < board.length && y + i < board.length; i++) {
//            if ((abs(x - (x + i)) == abs(y - (y + i)))) {
//                board[x + i][y + i] = 1;
//                System.out.println("x:" + (x + i) + "  y:" + (y + i));
//            }
//        }
//
//        /* NW moves*/
//        for (i = 1; x - i >= 0 && y + i < board.length; i++) {
//            if ((abs(x - (x + i)) == abs(y - (y + i)))) {
//                board[x - i][y + i] = 1;
//                System.out.println("x:" + (x - i) + "  y:" + (y + i));
//            }
//        }
//
//
//        /* SE moves */
//        for (i = 1; x + i < board.length && y - i >= 0; i++) {
//            if ((abs(x - (x + i)) == abs(y - (y + i)))) {
//                board[x + i][y - i] = 1;
//                System.out.println("x:" + (x + i) + "  y:" + (y - i));
//            }
//        }
//
//
//        /* SW moves*/
//        for (i = 1; x - i >= 0 && y - i >= 0; i++) {
//            if ((abs(x - (x + i)) == abs(y - (y + i)))) {
//                board[x - i][y - i] = 1;
//                System.out.println("x:" + (x - i) + "  y:" + (y - i));
//            }
//        }

    }

}
