/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class ZooManager {
    
    public static void AjouterAnimal(Animal a) throws IOException{
        
        FileWriter fw = new FileWriter("src/data/data.txt",true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write(a.getName());
        bf.close(); 
    }
}
