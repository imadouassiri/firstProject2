/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class JavaApplication4 {
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner myKb = new Scanner(System.in);
         System.out.println("wwhat is your dog's name?");
         String dogName = myKB.nextLine();
         System.out.println("does " + dogname + "bark a lot?");
         System.out.println("Pick a number from 1 to 100");
         try{
             int number = myKB.nextInt();
             System.out.println("the squre of that number is " + (number * number));
        
            } 
         catch(Exception e){
                     
           System.out.println("that was not a number");
         }
    }
    
}
