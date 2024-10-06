/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whoareyouscanner;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class WhoAreYouScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner KB = new Scanner(System.in);//standard scanner declaration for keyboard input
        String name;
        
       
        System.out.println("what's your name?");// diplay prompt
         
        
        
        try{
            name = KB.nextLine();
           
            System.out.println("oh, that's a nice name." + name);//this gets the input from the keyboard - reads the whole line
           
            
            
        }catch(Exception e){
            System.out.println("Invalid Input. enter your name");
        }
    }
    
}
