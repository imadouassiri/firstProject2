/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question5bufferedversion;

import java.io.BufferedReader;

import java.io.InputStreamReader;

/**
 *
 * @author Dell
 */
public class Question5BufferedVersion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        BufferedReader KB = new BufferedReader(new InputStreamReader(System.in));
        int num1;
         int num2;
        try{
            System.out.println("please, enter a number");
        num1 = Integer.parseInt(KB.readLine());
        System.out.println("please, enter a second number");
         num2 = Integer.parseInt(KB.readLine());
         int sum = num1 + num2;
         System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        }catch(Exception e){
            System.out.println("invalid message");
        }
        
        
    }
        
       
       
        
        
        
       
        
        
            
            
        }
        
    
    

