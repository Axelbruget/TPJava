/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author axbruget1
 */
public class Stub {
    
    public static HashMap<Article,Integer> getArticles(){
        HashMap<Article,Integer> listeArticles = new HashMap<>();
        
        listeArticles.put(new Livre("Livre",21.8), 2);
        listeArticles.put(new Enceinte("Enceinte",81.7), 1);
        listeArticles.put(new Television("Television",1782.99), 3);
        listeArticles.put(new Telephone("Telephone",521.99), 0);
        
        return listeArticles;
    }
}
