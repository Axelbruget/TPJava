/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.time.LocalDate;
import java.util.List;
import metier.Bug;

/**
 * La classe Afficheur permet d'afficher des informations sur la console
 * @author axbruget1
 */
public class Afficheur {
    
    /**
     * Methode qui permet d'afficher un message 
     * @param message qui est affiché
     */
    public static void afficher(String message){
        System.out.println(message);
    }
    
    /**
     * Methode qui permet d'afficher le menu 
     */
    public static void afficherMenu(){
        afficher("\n Que choisissez vous ?");
        afficher("1. Ajouter un bug");
        afficher("2. Afficher la liste des bugs");
        afficher("3. Quitter l'application");
        afficher("4. Afficher la date");
    }

    /**
     * Demande à l'utilisateur d'entrer un nom de Bug
     */
    public static void demanderNomBug() {
        afficher("Quel est le nom du bug que vous souhaitez ajouter ?");
    }
    
    /**
     * Permet d'afficher la liste de tous les Bugs de la liste 
     * @param list la liste de tous les bugs
     */
    public static void afficherListBug(List<Bug> list){
        for (Bug bug : list){
            afficher(bug.getNom());
        }
    }
    
    public static void afficherDate(){
        String date = LocalDate.now().toString();
        afficher(String.format("Nous sommes le : %s", date));
    }
}
