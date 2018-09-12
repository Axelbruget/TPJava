/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import metier.Bug;

/**
 *
 * @author axbruget1
 */
public class FileManager {
    
    public static void addBug(String name){
        try(FileWriter fw = new FileWriter("src/data/data.txt",true)){
            fw.write("\n" + name);
        }catch(IOException e){
            System.err.println("ERROR Writing in file");
        }
    }
    
    public static List<Bug> getData(){
        List<Bug> list = new ArrayList<>();
        
        try(FileReader fr = new FileReader("src/data/data.txt")){
            BufferedReader bf = new BufferedReader(fr);
           
            for (String line = bf.readLine(); line != null; line = bf.readLine()) {
                list.add(new Bug(line));
            }
            
        }catch(IOException e){
            System.err.println("ERROR reading file");
        } 
       return list;
    }
}
