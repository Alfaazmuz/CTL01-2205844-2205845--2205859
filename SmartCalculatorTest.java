package smartcal;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SmartCalculatorTest {

    private static SmartCalculator smartCalculator;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class");
        smartCalculator = new SmartCalculator();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After Class");
        smartCalculator = null;
    }

    @Test
    public void testCalculateSimpleInterest() {
        // Test the calculateSimpleInterest method

        // Set up test data
        double principal = 1000.0;
        double rate = 5.0;
        int time = 2;

        // Set the values using the setter methods
        smartCalculator.setPrincipal(principal);
        smartCalculator.setRate(rate);
        smartCalculator.setTime(time);

        // The expected result is (1000 * 5 * 2) / 100 = 100
        double expectedInterest = 100.0;

        // Call the method being tested
        double actualInterest = smartCalculator.calculateSimpleInterest();

        // Assert the result
        assertEquals(expectedInterest, actualInterest, 0.01);
    }
}
