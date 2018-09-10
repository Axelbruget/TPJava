/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import java.util.Map;

/**
 *
 * @author admin
 */
public class GestionnaireStock {
    public static void retirerProduit(Article article,int quantite){
        for ( Map.Entry<Article,Integer> articles : Stock.getStock().entrySet()){
            if ( articles.getKey().getNom().equals(article.getNom())){
                articles.setValue(articles.getValue() - quantite);
            }
        }  
    }
}
