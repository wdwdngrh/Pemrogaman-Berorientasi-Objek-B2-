import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Write a description of class SalesItemTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/**
 * The test class SalesItemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testRateBound()
    {
        SalesItem salesIte1 = new SalesItem("burger", 3000);
        assertEquals(false, salesIte1.addComment("orang", "keren", 7));
    }

    @Test
    public void testCommentNum()
    {
        SalesItem salesIte1 = new SalesItem("hotdog", 1000);
        assertEquals(0, salesIte1.getNumberOfComments());
    }

    @Test
    public void testDupe()
    {
        SalesItem salesIte1 = new SalesItem("pastry", 10000);
        assertEquals(true, salesIte1.addComment("manusia", "keren oi", 1));
        assertEquals(false, salesIte1.addComment("manusia", "keren banget", 3));
    }

    @Test
    public void test()
    {
        SalesItem salesIte1 = new SalesItem("coklat", 5000);
        assertEquals(false, salesIte1.addComment("orang", "keren banget", 7));
    }
}
