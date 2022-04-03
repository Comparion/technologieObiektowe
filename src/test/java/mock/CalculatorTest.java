package mock;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculatorTest {

    @Test
    void addition() {
        //given
        Calculator mock = Mockito.mock(Calculator.class);
        //when
        Mockito.when(mock.addition(1,2)).thenReturn(3);
        //then
        Assert.assertEquals(mock.addition(1,2),3);
    }
}