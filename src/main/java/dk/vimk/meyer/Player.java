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
    private Cup cups; 
    
    public Player()
    {
    	cups = new Cup();
        point = 0; 
    }
    
        public void shake()
            {
        	cups.shake();
            }
        public int getValue()
        {
            return cups.getValue();
        }
        public int cheat(int cheatValue)
        {           
            Random ran = new Random();
            cheatValue = ran.nextInt(35)+66; //f??r en tilf??ldig v??rdi mellem 0 og 35, men ligger 66 til for at f?? mit tilf??ldige tal mellem 66 og 100
            String check = cups.valueToString(cheatValue);
            while (!check.equalsIgnoreCase("ugyldig v??rdi"))
                    {
                        cheatValue = ran.nextInt(35)+66;
                        check = cups.valueToString(cheatValue);
                    }
            
            return cheatValue;
        }
        public int play(int playValue)
        {
            int value;
            if (playValue < 66) 
                    {
            			cups.shake();
                        value = getValue();
                        if (value < playValue)
                        {
                            value = cheat(playValue);
                        }
                    }
            else 
            {
                value =0;
            } 
            return value;
        }   
}

