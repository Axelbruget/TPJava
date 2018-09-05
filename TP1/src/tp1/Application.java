/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author axbruget1
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez votre numéro de compte :");
        int number = sc.nextInt();
        
        if (ApplicationManager.checkAccount(number)){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Ce numéro ne correspond à aucun compte");
        }
       
    }
    
}
