/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author axbruget1
 */
public class Stub {
    
    private static List<Personne> liste;
    
    static List<Personne> getList(){
        
         liste = new ArrayList();
         liste.add(new Personne(44,"Axel",new Compte(777,887)));
         liste.add(new Personne(12,"Thibaut",new Compte(888,582)));
         liste.add(new Personne(777,"Romain",new Compte(999,7978)));

         return liste;
         
    }
    
}
