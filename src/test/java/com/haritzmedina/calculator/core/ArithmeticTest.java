package com.haritzmedina.calculator.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Haritz Medina on 19/04/2016.
 */
public class ArithmeticTest {
    @Test
    public void sum() throws Exception {
        assertEquals(new Double(4.0), Arithmetic.sum(1.5,2.5));
        assertNotEquals(new Double(4.5), Arithmetic.sum(2.3, 2.1));
    }

    @Test
    public void subtract() throws Exception {

    }

    @Test
    public void multiply() throws Exception {

    }

    @Test
    public void divide() throws Exception {

    }

}