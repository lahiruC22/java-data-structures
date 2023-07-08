import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the methods of the NoDupArray class. This includes
 * tests for the insert, find and delete operations, along with a test to
 * verify an exception is thrown for insertion beyond capacity.
 * @author LahiruCW
 */
public class NoDupArrayIT {

    private NoDupArray noDupArray;

    @Before
    public void setUp() {
        noDupArray = new NoDupArray(5);
    }

    @Test
    public void testInsert() {
        noDupArray.insert(10);
        noDupArray.insert(20);
        noDupArray.insert(30);
        assertTrue(noDupArray.find(10));
        assertTrue(noDupArray.find(20));
        assertTrue(noDupArray.find(30));
    }

    @Test
    public void testFind() {
        noDupArray.insert(10);
        noDupArray.insert(20);
        assertTrue(noDupArray.find(10));
        assertTrue(noDupArray.find(20));
        assertFalse(noDupArray.find(30));
    }

    @Test
    public void testDelete() {
        noDupArray.insert(10);
        noDupArray.insert(20);
        assertTrue(noDupArray.delete(10));
        assertFalse(noDupArray.find(10));
        assertFalse(noDupArray.delete(30));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testInsertBeyondCapacity() {
        for (int i = 0; i < 6; i++) {
            noDupArray.insert(i * 10);
        }
    }
}
