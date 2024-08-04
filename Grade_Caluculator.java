//Grade calculator
/*Your program should take an integer input representing the numerical score and output the corresponding grade. If the input score is not within the valid range (0-100), the program should display "Invalid score".



Instructions :
The grading system is as follows:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59 */

import java.util.*;  

public class Grade_Caluculator {  
    public static void main(String[] args) {  
 Scanner scanner = new Scanner(System.in);  

        // Taking input score from the user  
        int score = scanner.nextInt();  

        // Checking if the input score is within the valid range  
        if (score < 0 || score > 100) {  
            System.out.println("Invalid score");  
        } else {  
            // Assigning grade based on the score range  
            String grade;  
            if (score >= 90) {  
                grade = "A";  
            } else if (score >= 80) {  
                grade = "B";  
            } else if (score >= 70) {  
                grade = "C";  
            } else if (score >= 60) {  
                grade = "D";  
            } else {  
                grade = "F";  
            }  

            // Printing out the corresponding grade  
            System.out.println(grade);  
        }  

     
    }  
}  
