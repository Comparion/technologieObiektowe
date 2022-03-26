import mockito.Calculator;
import org.mockito.Mockito;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculator mock = Mockito.mock(Calculator.class);
        Mockito.when(mock.addition(2,3)).thenReturn(6);
    }

}