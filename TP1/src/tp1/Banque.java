/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.List;

/**
 *
 * @author axbruget1
 */
public class Banque {
    private static List<Personne> listePersonne;
    
    static List<Personne> getPersonnes(){
        listePersonne = Stub.getList();
        return listePersonne;
    }
    
    
    
}
