/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import java.util.Map.Entry;

/**
 *
 * @author axbruget1
 */
public class Afficheur {
    
    public static void afficher(String message){
        System.out.println(message);
    }
    
    public static void afficherProduits(){
        afficher("Les produits disponibles sont :");
        
        for ( Entry<Article,Integer> articles : Stock.getStock().entrySet()){
            afficher(articles.getKey().getNom() + " " + articles.getKey().getPrix() + "€, " + articles.getValue() + " en stock");
        }
    }
    
    public static void demander(){
        afficher("Que voulez vous ?");
        
    }
}
