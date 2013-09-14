//rafleb??gre 
package dk.vimk.meyer;

/**
 *
 * @author Kim Vammen
 */
public class Cup
{
    private Die terning1;
    private Die terning2;

    public Cup()
    {
        terning1 = new Die();
        terning2 = new Die();
    }

    public void shake()
    {
        terning1.roll();
        terning2.roll();
    }

    public int getValue()
    {
        int value1 = terning1.getValue();
        int value2 = terning2.getValue();
        int result;

        if ((value1 == 1 && value2 == 2) || (value1 == 2 && value2 == 1))
        {
            result = 100;
        } else if ((value1 == 1 && value2 == 3) || (value1 == 3 && value2 == 1))
        {
            result = 80;
        } else if (value1 == value2)
        {
            result = 65 + value1 + value2;
        } else
        {
            if (value1 > value2)
            {
                result = value1 * 10 + value2;
            } else
            {
                result = value2 * 10 + value1;
            }
        }
        return result;
    }
    
    public static String valueToString(int value)
    {
        String result = "invalid value";
        if (value == 100) 
        {
            result = "Meyer";
        }         
            else if (value == 80)
            {
                result = "Lille meyer";
            }
            else if (value == 77)
            {    
                result = "Par 6";
            }
            else if (value == 75)
            {
                result = "Par 5";
            }
            else if (value == 73)
            {
                result = "Par 4";
            }
            else if (value == 71)
            {
                result = "Par 3";
            }
            else if (value == 69)
            {
                result = "Par 2";
            }
            else if (value == 67)
            {
                result = "Par 1";
            }
            else 
            {
                result = ""+value;
            }
       return result;
    }
}

