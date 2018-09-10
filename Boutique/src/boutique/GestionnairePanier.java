/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

/**
 *
 * @author admin
 */
public class GestionnairePanier {
    public static void ajouterProduit(Article article,int quantite){
        Panier.getArticles().put(article,quantite);
    }
}
