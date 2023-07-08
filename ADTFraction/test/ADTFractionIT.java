
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class provides a series of tests for the ADTFraction class. Each method
 * in this class is a unit test for a method in the ADTFraction class.
 *
 * @author LahiruCW
 * @version 1.0
 */
public class ADTFractionIT {

    /**
     * Test for the default constructor of the ADTFraction class.
     */
    @Test
    public void testDefaultConstructor() {
        ADTFraction fraction = new ADTFraction();
        assertEquals(0, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    /**
     * Test for the parameterized constructor of the ADTFraction class.
     */
    @Test
    public void testParameterConstructor() {
        ADTFraction fraction = new ADTFraction(2, 3);
        assertEquals(2, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    /**
     * Test for the set method of the ADTFraction class.
     */
    @Test
    public void testSet() {
        ADTFraction fraction = new ADTFraction();
        fraction.set(4, 5);
        assertEquals(4, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
    }

    /**
     * Test for the plus method of the ADTFraction class.
     */
    @Test
    public void testPlus() {
        ADTFraction fraction1 = new ADTFraction(1, 2);
        ADTFraction fraction2 = new ADTFraction(2, 3);
        ADTFraction result = fraction1.plus(fraction2);
        assertEquals(7, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    /**
     * Test for the times method (with a number parameter) of the ADTFraction class.
     */
    @Test
    public void testTimesWithNumber() {
        ADTFraction fraction = new ADTFraction(1, 2);
        ADTFraction result = fraction.times(2);
        assertEquals(1, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    /**
     * Test for the times method (with a fraction parameter) of the ADTFraction class.
     */
    @Test
    public void testTimesWithFraction() {
        ADTFraction fraction1 = new ADTFraction(1, 2);
        ADTFraction fraction2 = new ADTFraction(2, 3);
        ADTFraction result = fraction1.times(fraction2);
        assertEquals(1, result.getNumerator());
        assertEquals(3, result.getDenominator());
    }

    /**
     * Test for the reciprocal method of the ADTFraction class.
     */
    @Test
    public void testReciprocal() {
        ADTFraction fraction = new ADTFraction(1, 2);
        ADTFraction result = fraction.reciprocal();
        assertEquals(2, result.getNumerator());
        assertEquals(1, result.getDenominator());
    }

    /**
     * Test for the value method of the ADTFraction class.
     */
    @Test
    public void testValue() {
        ADTFraction fraction = new ADTFraction(1, 2);
        assertEquals(0.5, fraction.value(), 0.001);
    }

    /**
     * Test for the set method of the ADTFraction class with zero as the denominator.
     */
    @Test
    public void testSetWithZeroDenominator() {
        ADTFraction fraction = new ADTFraction();
        assertThrows(IllegalArgumentException.class, () -> fraction.set(1, 0));
    }
}
