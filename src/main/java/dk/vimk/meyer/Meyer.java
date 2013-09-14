// opgave 3 fra klasser og kontrolstrukturer fortsat - opbygning af spillet meyer med forenklede regler 

package dk.vimk.meyer;
/**
 
 * @author Kim Vammen
 */
public class Meyer
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
