/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import java.util.HashMap;

/**
 *
 * @author axbruget1
 */
public class Stock {
    private static HashMap<Article,Integer> articles;
    
    public static HashMap<Article,Integer> getStock(){
        return articles = Stub.getArticles();
    }
}
