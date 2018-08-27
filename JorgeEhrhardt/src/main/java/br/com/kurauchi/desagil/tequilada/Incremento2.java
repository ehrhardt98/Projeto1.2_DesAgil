package br.com.kurauchi.desagil.tequilada;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Incremento2 {
	
    public static void main(String[] args) {
    	
        try (BufferedReader bR = new BufferedReader(new FileReader("maze.txt"))) {
            String line;
            while ((line = bR.readLine()) != null) {
                System.out.println(line.replace("#", "X"));
            }
            
        } catch (IOException e) {
        	
            e.printStackTrace();
        }
        
    }
}