/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.FileManager;
import exception.WrongNumberException;
import io.Afficheur;
import io.EntreeClavier;
import metier.BugManager;

/**
 *
 * @author axbruget1
 */
public class BugApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Boolean running = false;
        int choice = 0;
        
        while ( running == false ){
            Afficheur.afficherMenu();
            
            try{
                choice = EntreeClavier.getEntreeInt();
            }catch(WrongNumberException e){
                System.err.println("Le nombre est incorrect");
            }
            
            switch(choice){
                case 1:
                    FileManager.getData();
                    Afficheur.demanderNomBug();
                    BugManager.ajouterBug(EntreeClavier.getEntreeString());
                    break;

                case 2: 
                    Afficheur.afficherListBug(BugManager.getListBug());
                    break;
                case 3:
                    running = true;
                    break;
                case 4:
                    Afficheur.afficherDate();
            }
        }
        
    }
    
}
