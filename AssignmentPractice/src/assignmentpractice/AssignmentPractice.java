/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentpractice;

/**
 *
 * @author Dell
 */
public class AssignmentPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, answer; // declare THREE integer variables called num1, num2 and answer.//
        num1 = 8; // Store the number 8 into num1
        num2 = 76; // store the number 76 into num2
        answer = num1 + num2; //Store the SUM of num1 and num2 into answer
        System.out.println(answer);
        answer = num1*num2; //store the PRODUCT of num1 and num2 into answer
        System.out.println(answer);
        num1 = answer; //store the value of answer into num1
        answer = num1*num2; //Store the PRODUCT of num1 and num2 into answer
        System.out.println(answer);
        System.out.println("the answer is " + answer + ". isn't that great!");
    }
    
}
