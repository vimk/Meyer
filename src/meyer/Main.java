// opgave 3 fra klasser og kontrolstrukturer fortsat - opbygning af spillet meyer med forenklede regler 

package meyer;
/**
 
 * @author Kim Vammen
 */
public class Main
{  
    private static Player computer;
    private static Player menneske;

    
    public static void main(String[] args)
    {
        computer = new Player();
        menneske = new Player();

        computer.shake();
         
        
    }
}
