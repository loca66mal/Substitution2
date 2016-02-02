/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substitution;

/**
 *
 * @author jpn
 */
public class Substitution {

    /**
     * @param args the command line arguments
     */
    private static MatchTeam lagUppställningen;
    private static FieldTeam lagetPåBanan;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        lagUppställningen = new MatchTeam();
        lagetPåBanan = new FieldTeam();
        fyllLagUppställning();
    }
    
    private static void fyllLagUppställning()
    {
        lagUppställningen.addPlayer(new Player("Ett", "Ettson", 1));
        lagUppställningen.addPlayer(new Player("Två", "Tvåsson", 2));
        lagUppställningen.addPlayer(new Player("Tre", "Tresson", 3));
        lagUppställningen.addPlayer(new Player("Fyra", "Fyrsson", 4));
        lagUppställningen.addPlayer(new Player("Fem", "Femsson", 5));
        lagUppställningen.addPlayer(new Player("Sex", "Sexsson", 6));
        lagUppställningen.addPlayer(new Player("Sju", "Sjusson", 7));
        lagUppställningen.addPlayer(new Player("Åtta", "Åttsson", 8));
        lagUppställningen.addPlayer(new Player("Nio", "Niosson", 9));
    }
    
}
