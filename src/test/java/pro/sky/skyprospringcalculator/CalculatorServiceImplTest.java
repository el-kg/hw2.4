package pro.sky.skyprospringcalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.skyprospringcalculator.exception.DivideNullException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    private int num1 =7;
    private int num2 =2;

    @Test
    void plus_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {
        int num1 =1;
        int num2 =2;
        long result= calculatorService.plus(num1,num2);
        assertEquals(num1+num2,result);
    }
    @Test
    void plus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerThenNum1() {
        num2 =-8;
        long result= calculatorService.plus(num1,num2);
        assertEquals(num1+num2,result);
    }
    @Test
    void minus_shouldReturnPositiveNumWhenNum1AndNum2ArePositiveAndNum1BiggerThenNum2(){
        long result= calculatorService.minus(num1,num2);
        assertEquals(num1-num2,result);
    }
    @Test
    void minus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerThenNum1(){
        num2=9;
        long result= calculatorService.minus(num1,num2);
        assertEquals(num1-num2,result);
    }
    @Test
    void multiply_shouldReturnNegativeWhenOneOfNumsNegative() {
        num2=-5;
        long result= calculatorService.multiply(num1,num2);
        assertEquals((long) num1 *num2,result);
    }
    @Test
    void multiply_shouldReturnPositiveWhenBothOfNumsNegative() {
        num1=-4;
        num2=-9;
        long result= calculatorService.multiply(num1,num2);
        assertEquals((long) num1 *num2,result);
    }

    @Test
    void divide_shouldReturnPositiveNumWhenNum1AndNum2ArePositive()  {
        double result= calculatorService.divide(num1,num2);
        assertEquals((double) num1/num2,result);
    }
    @Test
    void divide_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegative()  {
        num2 =-8;
        double result= calculatorService.divide(num1,num2);
        assertEquals((double)num1/num2,result);
    }
    @Test
    void divide_shouldThrowDivideNullExceptionWhenNum2IsNull(){
        num2=0;
        DivideNullException result = assertThrows(DivideNullException.class,
                () -> calculatorService.divide(num1, num2));
        assertEquals("Деление на ноль недопустимо!",result.getMessage());
    }
}