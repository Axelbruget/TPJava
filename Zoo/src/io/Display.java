/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

/**
 *
 * @author admin
 */
public class Display {
    
    public static void display(String message){
        System.out.println(message);
    }
    
    public static void displayMenu(){
        display("Que souhaitez vous faire ?");
        display("1. Ajouter un animal");
        display("2. Retirer un animal");
    }
    
    public static void askAnimalName(){
        display("Ecrivez le nom de l'animal que vous voulez ajouter au Zoo");
    }
}
