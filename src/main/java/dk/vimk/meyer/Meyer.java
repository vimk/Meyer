// opgave 3 fra klasser og kontrolstrukturer fortsat - opbygning af spillet meyer med forenklede regler 

package dk.vimk.meyer;

import java.util.ArrayList;

/**
 
 * @author Kim Vammen
 */
public class Meyer
{
	private ArrayList<Player> players = new ArrayList<Player>();
    
    public void addPlayer(Player player)
    {
    	players.add(player);
    }
    
    public void removePlayer(Player player)
    {
    	players.remove(player);
    }
    
    public int numberOfPlayers()
    {
    	return players.size();
    }
}
