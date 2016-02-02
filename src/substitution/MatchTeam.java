/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substitution;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author jpn
 */
public class MatchTeam {
    
    private ArrayList<Player> theTeam;

    public MatchTeam() {
        theTeam = new ArrayList<>();
    }

    public void addPlayer(Player player) {

        if (!theTeam.contains(player)) {

            theTeam.add(player);
        }
        //else throw exception?
    }
    
    public void addPlayerInPosition(int pos, Player player) {

        if (!theTeam.contains(player)) {

            theTeam.add(pos,player);
        }
        //else throw exception?
    }
    
    public void removePlayer(Player player) {
        
        Iterator it = theTeam.iterator();
        
        while(it.hasNext()){            
            Player presentPlayer = (Player)it.next();        
            if (presentPlayer==player){
            it.remove();      
        }
        }       
        
        //else throw exception?
    }
    
    //skräpmetod
    public void fyllLagUppställning()
    {
        addPlayer(new Player("Ett", "Ettson", 1));
        addPlayer(new Player("Två", "Tvåsson", 2));
        addPlayer(new Player("Tre", "Tresson", 3));
        addPlayer(new Player("Fyra", "Fyrsson", 4));
        addPlayer(new Player("Fem", "Femsson", 5));
        addPlayer(new Player("Sex", "Sexsson", 6));
        addPlayer(new Player("Sju", "Sjusson", 7));
        addPlayer(new Player("Åtta", "Åttsson", 8));
        addPlayer(new Player("Nio", "Niosson", 9));
    }
 
    
    
    
    
    
}