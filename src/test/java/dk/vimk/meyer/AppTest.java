package dk.vimk.meyer;

import static junit.framework.Assert.assertEquals;
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
    
    public Meyer TwoPlayerGame()
    {
        Meyer meyer = new Meyer();
        
        Player human = new Player();
        meyer.addPlayer(human);
        
        Player computer = new Player();
        meyer.addPlayer(computer);
        
        return meyer;
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
        Meyer meyer = TwoPlayerGame();
        assertEquals(2, meyer.numberOfPlayers());
    }
    
    public void testShakeValue()
    {
        Meyer meyer = TwoPlayerGame();
        Player human = meyer.getPlayer(0);
        Cup cup = human.getCup();
        
        cup.getDie1().setValue(1);
        cup.getDie2().setValue(2);
        assertEquals(100, cup.getValue());
        
        cup.getDie1().setValue(1);
        cup.getDie2().setValue(3);
        assertEquals(80, cup.getValue());
        
        cup.getDie1().setValue(1);
        cup.getDie2().setValue(1);
        assertEquals(67, cup.getValue());
    }
    public void testCheat()
    {
        Meyer meyer = TwoPlayerGame();
        Player computer = meyer.getPlayer(1);
        Cup cup = computer.getCup();
        
        cup.getDie1().setValue(2);
        cup.getDie2().setValue(5);
        
        int cheatValue = computer.cheat();
        assertTrue(cheatValue > cup.getValue());
    }
    
    public void testDiceValues()
    {
        Meyer meyer = TwoPlayerGame();
        Player computer = meyer.getPlayer(1);
        Cup cup = computer.getCup();
        
        cup.getDie1().setValue(2);
        cup.getDie2().setValue(5);
        
        assertEquals(52, cup.getValue());
    }
}
