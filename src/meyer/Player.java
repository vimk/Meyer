// Spiller
package meyer;

import java.util.Random;

/**
 *
 * @author Kim Vammen
 */
public class Player
{
    private int point;
    private Cup bægre; 
    
    public Player()
    {
        bægre = new Cup();
        point = 0; 
    }
    
        public void shake()
            {
                bægre.shake();
            }
        public int getValue()
        {
            return bægre.getValue();
        }
        public int cheat(int cheatValue)
        {           
            Random ran = new Random();
            cheatValue = ran.nextInt(35)+66; //får en tilfældig værdi mellem 0 og 35, men ligger 66 til for at få mit tilfældige tal mellem 66 og 100
            String check = bægre.valueToString(cheatValue);
            while (!check.equalsIgnoreCase("ugyldig værdi"))
                    {
                        cheatValue = ran.nextInt(35)+66;
                        check = bægre.valueToString(cheatValue);
                    }
            
            return cheatValue;
        }
        public int play(int playValue)
        {
            int value;
            if (playValue < 66) 
                    {
                        bægre.shake();
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

