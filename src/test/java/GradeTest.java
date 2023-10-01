import org.testng.Assert;
import org.testng.annotations.*;

public class GradeTest {

    @DataProvider(name = "gradeData")
    public Object[][] gradeData() {
        return new Object[][]{
                {1000000, "Invalid"},
                {101, "Invalid"},
                {100, "Excellent"},
                {99, "Excellent"},
                {91, "Excellent"},
                {90, "Excellent"},
                {89, "Very Good"},
                {88, "Very Good"},
                {81, "Very Good"},
                {80, "Very Good"},
                {79, "Good"},
                {78, "Good"},
                {71, "Good"},
                {70, "Good"},
                {69, "Accepted"},
                {68, "Accepted"},
                {61, "Accepted"},
                {60, "Accepted"},
                {59, "Failed"},
                {58, "Failed"},
                {41, "Failed"},
                {40, "Failed"},
                {39, "Invalid"},
                {0, "Invalid"},
                {-1, "Invalid"},
                {-1000000, "Invalid"},
        };
    }

    @Test(dataProvider = "gradeData")
    public void testGrade(int mark, String expected) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.getGrade(mark), expected);
    }
}
