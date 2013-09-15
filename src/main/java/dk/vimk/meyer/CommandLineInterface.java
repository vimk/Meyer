/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.vimk.meyer;

import java.util.Scanner;

/**
 *
 * @author vimk
 */
public class CommandLineInterface
{
    public String name()
    {
    Scanner scan = new Scanner(System.in);

    String playerName;

    System.out.print("Type in playername: ");
    playerName = scan.nextLine(); 
        
    return playerName;
    }
}