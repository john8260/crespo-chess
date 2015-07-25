package com.crespo.models.utils;

import com.crespo.models.Bishop;
import com.crespo.models.Piece;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author john
 */
public class PieceFactoryTest {
    
    public PieceFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPiece method, of class PieceFactory.
     */
    @Test
    public void testGetPiece() {
        System.out.println("getPiece");
        PieceFactory instance = new PieceFactory();
        Piece result = instance.getPiece(PieceType.BISHOP, PieceColour.BLACK);
        Assert.assertTrue(result instanceof Bishop);

    }
    
}
