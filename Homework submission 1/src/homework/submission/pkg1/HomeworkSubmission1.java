/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework.submission.pkg1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class HomeworkSubmission1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner KB = new Scanner(System.in);
        String name;

        // Loop until we get valid input
        while (true) {
            System.out.print("Please enter your name (text only, no numbers): ");
            name = KB.nextLine();

            // Check if input contains any digits
            if (!name.matches("[a-zA-Z ]+")) {
                System.out.println("Error: Name should only contain alphabetic characters and spaces. Please try again.\n");
            } else {
                // Modify the name using string methods
                String modifiedName = name.toUpperCase();
                // Additional modification: Reverse the name and add a suffix "_MODIFIED"
                modifiedName = new StringBuilder(modifiedName).reverse().toString() + "_EDITED";

                // Display the modified name
                System.out.println("Modified Name: " + modifiedName);
                break;
            }
        }

        KB.close();
    }
    
}
