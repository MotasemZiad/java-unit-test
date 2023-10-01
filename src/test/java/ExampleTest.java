import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleTest {
    @DataProvider(name = "divisionData")
    public Object[][] dpMethod() {
        return new Object[][]{
                {10.0f, 5.0f, 2.0f},
                {-10.0f, 5.0f, -2.0f},
                {10.0f, -5.0f, -2.0f},
                {-10.0f, -5.0f, 2.0f},
                {0.0f, 5.0f, 0.0f},
                {0.0f, -5.0f, 0.0f},
        };
    }

    @DataProvider(name = "invalidDivisionData")
    public Object[][] invalidDivisionMethod() {
        return new Object[][]{
                {10.0f, 0.0f, 2.0f},
                {-10.0f, 0.0f, 2.0f},
                {0.0f, 0.0f, 2.0f},
        };
    }

    @Test(dataProvider = "divisionData")
    public void testDivision(float x, float y, float expected) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.division(x, y), expected);
    }

    @Test(dataProvider = "invalidDivisionData", expectedExceptions = {ArithmeticException.class})
    public void testInvalidDivisionData(float x, float y, float expected) {
        Calculator calculator = new Calculator();
        calculator.division(x, y);
    }
}
