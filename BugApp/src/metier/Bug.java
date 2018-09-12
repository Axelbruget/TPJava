/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;


/**
 *
 * @author axbruget1
 */
public class Bug {
    private String nom;
    private final int CODE = 404;

    public Bug(String nom){
        this.nom = nom; 
    }

    public String getNom() {
        return nom;
    }

    public int getCODE() {
        return CODE;
    }
    
    
    
}
