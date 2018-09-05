/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import static boutique.Afficheur.afficher;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author axbruget1
 */
public class BoutiqueManager {
    
    public static Article getArticle(String nomArticle){
        for ( Article a : Stock.getStock().keySet()){
            if ( nomArticle.equals(a.getNom())){
                return a;
            }
        }
        return null;
    }
    public static void checkStock(int quantiteDemande, Article article){
        for ( int quantite : Stock.getStock().values()){
            if ( quantite > quantiteDemande ){
                
            }
            else{
                Afficheur.afficher("");
            }
        }
    }
}
