package junit;

import calc.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTestJUnit {

    @Test
    public void addition_valuesPositive_correctResultCalc(){
        //given
        int a = 5;
        int b = 10;
        Calculator calc = new Calculator();
        //when
        int result = calc.addition(a,b);
        //then
        Assertions.assertEquals(15, result);
    }
}
