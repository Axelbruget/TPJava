/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import io.Display;
import io.Retrieve;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Display.displayMenu();
        
        switch(Retrieve.getUserChoice()){
            case 1:
                Display.askAnimalName();
                ZooManager.AjouterAnimal(new Animal(Retrieve.getAnimalName()));
                break;
            case 2:
                break;
        }
        
    
    }
    
}
