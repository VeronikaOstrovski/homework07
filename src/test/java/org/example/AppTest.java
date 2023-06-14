package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */

//Homework 08
//Task 2

public class AppTest {

@Test
    @BeforeEach
    public void calculator5(){
        Calculator calculator = new Calculator();
        assertEquals(12.0,12.0, 0.001);
    }
@Test
    public void calculator6 (){
        assertEquals(12.5,12.5, 0.001);
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
