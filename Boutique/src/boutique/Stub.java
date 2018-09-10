/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author axbruget1
 */
public class Stub {
    
    public static HashMap<Article,Integer> getArticles() throws FileNotFoundException, IOException{
        Scanner s = new Scanner("stub.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();   
        return null;
    }
}
