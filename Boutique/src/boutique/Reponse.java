/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import java.util.Scanner;

/**
 *
 * @author axbruget1
 */
public class Reponse {
    
    public static String reponseNom(){
        Scanner sc = new Scanner(System.in);
        String reponse = sc.nextLine();
        return reponse;
    }
    
    public static int reponseQuantite(){
        Scanner sc = new Scanner(System.in);
        int reponse = sc.nextInt();
        return reponse;
    }
}
