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
public class ApplicationManager {
    
    public static boolean checkAccount(int number){
       
        for ( Personne p : Banque.getPersonnes()){
            if (p.getCompte().getNumber() == number ){
                return true;
            }
        }
        return false; 
    }
    
}
