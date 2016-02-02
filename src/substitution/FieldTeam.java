/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substitution;

import java.util.ArrayList;

/**
 *
 * @author jpn
 */
public class FieldTeam {
    
    private Player[] theFieldTeam;

    public FieldTeam() {
        theFieldTeam = new Player[7];
    }    
    
    public void addPlayer(int position, Player player)
    {
        theFieldTeam[position] = player;
    
    }   

                
} 