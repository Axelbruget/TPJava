/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

/**
 *
 * @author axbruget1
 */
public class Boutique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Afficheur.afficherProduits();
        Afficheur.afficher("Que voulez vous ?");
        String nomArticle = Reponse.reponseNom();
        Article article = BoutiqueManager.getArticle(nomArticle);
        if ( article != null ){
            Afficheur.afficher("En quelle quantite ?");
            int quantiteArticle = Reponse.reponseQuantite();
            if ( quantiteArticle > 0 ){
                BoutiqueManager.checkStock(quantiteArticle,article);
            }
        }
    }
    
}
