// svarer til en terninge klasse 
package meyer;

import java.util.Random;

/**
 *
 * @author Kim Vammen
 */
public class Die
{
    public final static int MAX_VALUE = 6;  //instanc variable
    private int value;                      //instance variable 
    
    public Die () //constructor
    {
        roll(); 
    }
    
        public int getValue () //metode med returværdi
        {
            return value;         
        }        
            public void roll () //kaster terningen
            {
                Random ran = new Random ();
                value = ran.nextInt(MAX_VALUE) + 1;
            }
            
}
