import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TemperatureConverterTest.
 * Use this test suite to test your methods.
 *
 * @author  Joe Polacco
 * @version July 28, 2020
 */
public class TemperatureConverterTest
{
  
    
    @Test
    public void testFToCPositive() {
        TemperatureConverter converter = new TemperatureConverter();
        // assert statements
        assertEquals(100.0, converter.fToC(212.0), 0.0000001);
        assertEquals(232.77777777, converter.fToC(451.0), 0.0000001);        
    }
    
    @Test
    public void testFToCNegative() {
        TemperatureConverter converter = new TemperatureConverter();
        // assert statements
        assertEquals(-40.0, converter.fToC(-40.0), 0.0000001); 
    }
        
    @Test
    public void testFToCZero() {
        TemperatureConverter converter = new TemperatureConverter();
        // assert statements
        assertEquals(0.0, converter.fToC(32.0), 0.0000001);
    }
  
 
    
    /**
     * Default constructor for test class TemperatureConverterTest
     */
    public TemperatureConverterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
