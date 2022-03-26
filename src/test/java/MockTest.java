import mockito.Calculator;
import org.junit.Test;
import org.mockito.Mockito;

public class MockTest {

    @Test
    public void test(){
        Calculator mock = Mockito.mock(Calculator.class);
        Mockito.when(mock.addition(1,2)).thenReturn(3);
    }
}
