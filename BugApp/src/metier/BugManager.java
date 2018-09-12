/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import data.FileManager;
import java.util.List;

/**
 *
 * @author axbruget1
 */
public class BugManager {
    
    
    public static void ajouterBug(String nom){
        Bug b = new Bug(nom);
        FileManager.addBug(nom);
    }
    
    public static List<Bug> getListBug(){
        return FileManager.getData();
    }
}
