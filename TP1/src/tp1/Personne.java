/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author axbruget1
 */
public class Personne {
    
    private int id;
    private String username;
    private Compte compte;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Compte getCompte() {
        return compte;
    }
    
    public Personne(int id){
        this.id = id;
    }
    
    public Personne(int id,String username,Compte compte){
        this.id = id;
        this.username = username;
        this.compte = compte;
    }
   
}
