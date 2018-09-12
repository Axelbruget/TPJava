/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import static boutique.Afficheur.afficher;
import java.util.Map;

/**
 *
 * @author axbruget1
 */
public class BoutiqueManager {
    
    public static boolean checkName(String nomArticle){
        for ( Article a : Stock.getStock().keySet()){
            if ( nomArticle.equals(a.getNom())){
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkStock(String nomArticle){
        
        for ( Map.Entry<Article,Integer> articles : Stock.getStock().entrySet()){
            // todo
        }
    }
}
