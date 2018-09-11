/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Retrieve {
    
    public static int getUserChoice(){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
    
    public static String getAnimalName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }
}
