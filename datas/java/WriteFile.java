package com.sgrillon.javasample;
 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
 
public class WriteFile {
     
    public static void main(String[] args) {
         
        String contentTxt = "";
        String fileName = "file.txt";
         
        // create a text file and append data line by line
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter fichierSortie = new PrintWriter(bw);
            fichierSortie.println(contentTxt + "\n test de lecture et écriture !!");
            fichierSortie.close();
            System.out.println("Le fichier " + fileName + " a été créé!");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
         
    }
     
}
