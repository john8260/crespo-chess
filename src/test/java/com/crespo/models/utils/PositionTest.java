package com.crespo.models.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author john
 */
public class PositionTest {
    
    public PositionTest() {
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
     * Test of getX method, of class Position.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        String strPosition = "e3";
        int result = 0;
        for(Position auxPos : Position.values()){
            if(strPosition.equals(auxPos.getName()))
                result = auxPos.getX();                
        }
        int expResult = 4;
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Position.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        String strPosition = "e3";
        int result = 0;
        for(Position auxPos : Position.values()){
            if(strPosition.equals(auxPos.getName()))
                result = auxPos.getY();                
        }
        int expResult = 2;
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Position.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "e3";
        String result = "";
        for(Position auxPos : Position.values()){
            if(auxPos.getName().equals(expResult))
                result = auxPos.getName();                
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosition method, of class Position.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        int x = 4;
        int y = 2;
        Position expResult = Position.e3;
        Position result = Position.getPosition(x, y);
        assertEquals(expResult, result);
    }
    
}
