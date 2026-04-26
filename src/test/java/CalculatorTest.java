package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Mock
    private Calculator calculatorMock;

    private Calculator calculator;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        Assert.assertEquals(5, calculator.addition(2, 3));
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(1, calculator.subtraction(3, 2));
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(6, calculator.multiplication(2, 3));
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(2.0, calculator.division(6, 3), 0.0);
    }

    @Test
    public void testAdditionWithMock() {
        when(calculatorMock.addition(2, 3)).thenReturn(5);
        int result = calculatorMock.addition(2, 3);
        Assert.assertEquals(5, result);
        verify(calculatorMock, times(1)).addition(2, 3);
    }

    @Test
    public void testSubtractionWithMock() {
        when(calculatorMock.subtraction(5, 3)).thenReturn(2);
        int result = calculatorMock.subtraction(5, 3);
        Assert.assertEquals(2, result);
        verify(calculatorMock, times(1)).subtraction(5, 3);
    }
}