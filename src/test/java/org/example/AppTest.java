package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void stringIsNotEmpty() {
        SimpleTest stringIsNotEmpty = new SimpleTest();
        assertNotNull("");
    }

        @Test
        public void theTwoValuesAreEqual() {
            SimpleTest theTwoValuesAreEqual = new SimpleTest();
            assertTrue(25==25);
        }





//    @Test
//    public void checkTwoValuesEquals(){
//
//        //
//        //
//
//        assertEquals( 3 , 3);
//    }
//
//    @Test
//    public void checkTwoValuesNotEquals(){
//        assertNotEquals( 3 , 4);
//    }
//
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( 3 == 3 );
//    }
//
//    @Test
//    public void shouldAnswerWithFalse()
//    {
//        assertFalse( 4 < 2 );
//    }
//

    }
