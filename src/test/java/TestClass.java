import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

    public class TestClass {
        @Test
        void test() throws MyException {
            ExampleClass exampleClass = new ExampleClass();
            Assertions.assertEquals(6, exampleClass.squareTriangle(2,6, 7));
            Assertions.assertThrows(MyException.class, ()-> exampleClass.squareTriangle(-1,2,3));
            Assertions.assertThrows(MyException.class, ()-> exampleClass.squareTriangle(0,2,4));
            Assertions.assertThrows(MyException.class, ()-> exampleClass.squareTriangle(1,4,5));
        }
        @ParameterizedTest
        @CsvSource({ "30,40,50,600","3,4,5,6"})
        void testWithCsvSource(int a, int b, int c, int result) throws MyException {
            ExampleClass exampleClass = new ExampleClass();
            Assertions.assertEquals(result,exampleClass.squareTriangle(a,b,c));
        }
    }
