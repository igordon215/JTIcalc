package com.zipcodewilmington.scientific_calculator;

/**
 * Created by leon on 2/9/18.
 */

import com.zipcodewilmington.scientificcalculator.MathMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Test method for each mathematical operation
public class TestMainApplication {
    MathMethods test = new MathMethods();

    @Test
    public void addTest1() {
        assertEquals(20, test.add(10,10), 0.01);
    }

    @Test
    public void addTest2() {
        assertEquals(15.5, test.add(10, 5.5), 0.01);
    }

    @Test
    public void subtractTest1() {
        assertEquals(8, test.subtract(15, 7), 0.01);
    }

    @Test
    public void subtractTest2() {
        assertEquals(14.3, test.subtract(20, 5.7), 0.01);
    }

    @Test
    public void multiplicationTest1() {
        assertEquals(60, test.multiplication(10, 6),0.01);
    }

    @Test
    public void multiplicationTest2() {
        assertEquals(106.64, test.multiplication(12.4, 8.6), 0.01);
    }

    @Test
    public void divisionTest1() {
        assertEquals(14, test.division(126, 9), 0.01);
    }

    @Test
    public void divisionTest2() {
        assertEquals(8, test.division(48, 6), 0.01);
    }

    @Test
    public void remainderTest1() {
        assertEquals(4, test.remainder(14, 5), 0.01);
    }

    @Test
    public void remainder2() {
        assertEquals(0, test.remainder(9,9), 0.01);
    }

    @Test
    public void squareTest1() {
        assertEquals(49, test.square(7), 0.01);
    }

    @Test
    public void squareTest2() {
        assertEquals(144, test.square(12), 0.01);
    }

    @Test
    public void squareRootTest1() {
        assertEquals(12.0, test.squareRoot(144), 0.01);
    }

    @Test
    public void squareRootTest2() {
        assertEquals(7.0, test.squareRoot(49), 0.01);
    }

    @Test
    public void variExpoTest1() {
        assertEquals(125, test.variExpo(5, 3), 0.01);
    }

    @Test
    public void variExpoTest2() {
        assertEquals(36, test.variExpo(6,2), 0.01);
    }

    @Test
    public void invertTest1(){
        assertEquals(-66, test.invert(66), 0.01);
    }

    @Test
    public void invertTest2(){
        assertEquals(-100, test.invert(100), 0.01);
    }

    @Test
    public void sineTest1() {
        assertEquals(0.766, test.sine(50), 0.01);
    }

    @Test
    public void sineTest2() {
        assertEquals(0.707, test.sine(45), 0.01);
    }

    @Test
    public void cosineTest1() {
        assertEquals(-0.984, test.cosine(175), 0.01);
    }

    @Test
    public void cosineTest2() {
        assertEquals(0.981, test.cosine(12), 0.01);
    }

    @Test
    public void tanTest1(){
        assertEquals(-1.732, test.tan(120), 0.01);
    }

    @Test
    public void tanTest2(){
        assertEquals(0.577, test.tan(30), 0.01);
    }

}
