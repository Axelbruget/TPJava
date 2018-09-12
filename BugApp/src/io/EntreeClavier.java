/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import exception.WrongNumberException;
import java.util.Scanner;

/**
 * Classe qui permet de gerer et recuperer toutes les entrees clavier de l'utilisateur
 * @author axbruget1
 */
public class EntreeClavier {
    
    /**
     * S'utilise quand on veut recuperer un nombre dans l'entree clavier 
     * @return le nombre que l'utilisateur entre 
     * @throws WrongNumberException exception leve lorsque le nombre ne correspond pas 
     */
    public static int getEntreeInt() throws WrongNumberException{
        
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();   
        
        if ( choix > 4 || choix < 1 ){
            throw new WrongNumberException();
        }
        
        return choix;
    }
    
    /**
     * S'utilise quand on veut recuperer une chaine de caractere dans l'entree clavier
     * @return la chaine de caractere que l'utilisateur entre 
     */
    public static String getEntreeString(){
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();
        return nom;
    }
}
