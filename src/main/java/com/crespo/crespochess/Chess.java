package com.crespo.crespochess;

import com.crespo.models.Board;
import com.crespo.models.Piece;
import com.crespo.models.utils.PieceColour;
import com.crespo.models.utils.PieceFactory;
import com.crespo.models.utils.PieceType;
import com.crespo.models.utils.Position;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author john
 */
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaring variables
        Scanner console;
        Board board;
        PieceFactory factory;
        Piece piece;
        List<Piece> pieces;
        boolean continuePlaying = true;

        System.out.println("Welcome to Crespo Chess");
        while(continuePlaying){
            
            try {
                //Initializing
                console = new Scanner(System.in);
                board = new Board();
                pieces = new ArrayList<>();
                //Factory method to create pieces
                factory = new PieceFactory();

                System.out.print("Please Enter number of pieces: ");
                System.out.println("");
                int pieceNum = console.nextInt();

                for (int i = 1; i <= pieceNum; i++) {
                    System.out.println("Piece " + i);
                    //Colour
                    System.out.println("Enter colour: ");
                    System.out.println("1. Black");
                    System.out.println("2. White");
                    int colour = console.nextInt();

                    //Type of piece
                    System.out.println("Enter type: ");
                    System.out.println("1. Bishop");
                    System.out.println("2. Knight");
                    System.out.println("3. Rook");
                    System.out.println("4. Queen");
                    int pieceType = console.nextInt();
                    console.nextLine();

                    //Position
                    System.out.println("Enter position (e.g g5, d1): ");
                    String position = console.nextLine();

                    switch (pieceType) {
                        case 1:
                            piece = factory.getPiece(PieceType.BISHOP, (colour == 1) ? PieceColour.BLACK : PieceColour.WHITE);
                            setPosition(position, piece);
                            //setting up the Bishop on the board
                            pieces.add(piece);
                            break;
                        case 2:
                            piece = factory.getPiece(PieceType.KNIGHT, (colour == 1) ? PieceColour.BLACK : PieceColour.WHITE);
                            setPosition(position, piece);
                            //setting up the knight on the board
                            pieces.add(piece);
                            break;
                        case 3:
                            piece = factory.getPiece(PieceType.ROOK, (colour == 1) ? PieceColour.BLACK : PieceColour.WHITE);
                            setPosition(position, piece);
                            //setting up the rook on the board
                            pieces.add(piece);
                            break;
                        case 4:
                            piece = factory.getPiece(PieceType.QUEEN, (colour == 1) ? PieceColour.BLACK : PieceColour.WHITE);
                            setPosition(position, piece);
                            //setting up the queen on the board
                            pieces.add(piece);
                    }
                }

                board.setPieces(pieces);
                CalculateOutput(board);
                
                System.out.println("Continue (Y/N)?: ");
                String cont = console.nextLine();
                
                if(cont.equalsIgnoreCase("N"))
                    continuePlaying = false;

            } catch (Exception e) {
                System.out.println("Something went wrong");
                //logger
            }
            
        }
    }

    private static void setPosition(String position, Piece piece) {
        for (Position auxPos : Position.values()) {
            if (position.toLowerCase().equals(auxPos.getName().toLowerCase())) {
                piece.setX(auxPos.getX());
                piece.setY(auxPos.getY());
            }
        }
    }

    //Calculate moves of each piece on the board
    private static void CalculateOutput(Board board) {
        for (Piece piece : board.getPieces()) {
            piece.ValidMoves(board);
            System.out.println("Valid Moves");
            System.out.print(piece.getType().getName() + " on " + Position.getPosition(piece.getX(), piece.getY()) + " [");
            
            //Iterator pattern from class Collections
            Iterator iterator = piece.getValidMoves().iterator();
            while(iterator.hasNext()){
                System.out.print((String)iterator.next());
                if(iterator.hasNext())
                    System.out.print(", ");
            }
            System.out.println("]");
            
        }
    }

}
