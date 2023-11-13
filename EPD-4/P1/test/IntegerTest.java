import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerTest {

    @Test
    public void testIntegerAddition() {
        Integer a = 5;
        Integer b = 10;
        Integer result = a + b;

        Assert.assertEquals(result, Integer.valueOf(15), "La suma no es correcta");
    }

     @Test
    public void testIntegerSubtraction() {
        Integer a = 10;
        Integer b = 5;
        Integer result = a - b;

        Assert.assertEquals(result, Integer.valueOf(5), "La resta no es correcta");
    }

    @Test
    public void testIntegerEquals() {
        Integer x = 42;
        Integer y = 42;

        Assert.assertEquals(x, y, "Los valores no son iguales");
    }

   @Test
    public void testIntegerMultiplication() {
        Integer a = 3;
        Integer b = 7;
        Integer result = a * b;

        Assert.assertEquals(result, Integer.valueOf(21), "La multiplicación no es correcta");
    }
}
