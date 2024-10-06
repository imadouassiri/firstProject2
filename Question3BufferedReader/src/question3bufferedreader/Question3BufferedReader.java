/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question3bufferedreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Dell
 */
public class Question3BufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader KB = new BufferedReader(new InputStreamReader(System.in));//standard bufferedReader declaration for keyboard input
        String quest,color;
        
        System.out.println("what's your quest?"); //display prompt
        
        try{
            quest = KB.readLine();//this gets the input from the keyboard - reads the whole line
            System.out.println("oh, that's a good quest, " + quest);
            System.out.println("what's your color?");
            color = KB.readLine();//this gets the input from the keyboard - reads the whole line
            System.out.println("Ah, I see your quest is to " + quest + " and your favourite colour is " + color);
            
        }catch(Exception e){
            System.out.println("Invalid Input");
            
        }
        
        
    }
    
}
