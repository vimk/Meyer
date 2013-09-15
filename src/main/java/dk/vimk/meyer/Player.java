// Spiller
package dk.vimk.meyer;

import java.util.Random;

/**
 *
 * @author Kim Vammen
 */
public class Player
{
    private int point;
    private Cup cup; 
    
    public Player()
    {
    	cup = new Cup();
        point = 0; 
    }
    
        public void shake()
            {
        	cup.shake();
            }
        public int getValue()
        {
            return cup.getValue();
        }
        public int cheat()
        {           
            Random ran = new Random();
            int cheatValue = ran.nextInt(35)+66; //f??r en tilf??ldig v??rdi mellem 0 og 35, men ligger 66 til for at f?? mit tilf??ldige tal mellem 66 og 100
            String check = cup.valueToString(cheatValue);
            return cheatValue;
        }
        
        public int play(int playValue)
        {
            int value;
            
            if (playValue < 66) 
            {
                cup.shake();
                value = getValue();
                if (value < playValue)
                {
                    value = cheat();
                }
            }
            else 
            {
                value = 0;
            } 
            return value;
        }   

    Cup getCup()
    {
        return cup;
    }
}

