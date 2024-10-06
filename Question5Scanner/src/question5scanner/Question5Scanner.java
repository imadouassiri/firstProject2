/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question5scanner;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Question5Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner KB = new Scanner(System.in);//standard scanner declaration for keyboard input
        int num1;
        int num2; 
        System.out.println("please, enter a number");// display prompt
        
        try{
            num1 = KB.nextInt();//this gets the input from the keyboard - reads the whole line
            System.out.println("please, enter a second number");
            num2 = KB.nextInt();//this gets the input from the keyboard - reads the whole line
            int answer = num1 + num2;// i set the sum of num1 and num2 into answer
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + answer);
            
            
        }catch(Exception e){
            System.out.println("Invalid Input. please enter a number");
            
        }
        
                
    }
    
}
