/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whoareyou;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Dell
 */
public class WhoAreYou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader KB = new BufferedReader(new InputStreamReader(System.in));//standard bufferedReader declaration for keyboard input
        String name;
        System.out.println("what's your name?"); //display prompt
        
        try{
            name = KB.readLine();//this gets the input from the keyboard - reads the whole line
            System.out.println("that's a very nice name, " + name);
            
        } catch(Exception e){
            System.out.println("Invalid Input. Enter your name");
        }
        
        
        
    }
    
}
