package dk.vimk.meyer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCorrectNumberOfPlayers()
    {
        Meyer meyer = new Meyer();
        
        Player human = new Player();
        meyer.addPlayer(human);
        
        Player computer = new Player();
        meyer.addPlayer(computer);
        
        assertEquals(2, meyer.numberOfPlayers());
    }
}
