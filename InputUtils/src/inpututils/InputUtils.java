/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututils;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class InputUtils {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner KB = new Scanner(System.in);
        String userInput;
        
        do {
            System.out.println("enter some text: ");
            System.out.println("you must enter text only!");
            userInput = KB.nextLine();
            
        }while(!userInput.matches("[a-zA-Z ]+"));
        System.out.println(userInput);
        
        
   
        String userNumber;
        
        do {
            System.out.println("enter a number: "); 
            System.out.println("you must enter a number only!");
            userNumber = KB.nextLine();
            
        }while(!userNumber.matches("[0-9]+"));
        int ans = Integer.parseInt(userInput);
        System.out.println("double that to " + (ans*2));
        
        int maxValue = 20;
        int NumberA = 0;
        
        
        
        do { 
            System.out.println("enter a number lower then 20");
            System.out.println("make sure its lower then 20");
            
            NumberA = KB.nextInt();
        }while(NumberA > maxValue );
        //for(int a=0; a<=maxValue; a++ ){
            
        }
        
        
        
    }


