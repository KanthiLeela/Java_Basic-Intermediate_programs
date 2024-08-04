//Determine the Loan Eligibility
/*Problem statement
You are tasked with creating a program for a bank that determines whether a person is eligible for a loan. The eligibility criteria for the loan are as follows:

Conditions :
The person must be at least 18 years old.
The person must have a monthly income of at least $2,000.
The person must not have any outstanding loans with the bank. */

import java.util.Scanner;

public class Loan_Eligibility {
    public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the age:");
        int age = sc.nextInt();
        //System.out.println("Enter the income");
        double income =sc.nextDouble();
        //System.out.println("Enter Loan criteria");
        boolean Loan = sc.nextBoolean();
        if(age > 18 && income >2_000.0 && !Loan )
        {
            System.out.println("You are eligible for the loan.");
        }
        else{
            System.out.println("You are not eligible for the loan.");
        }
    }
    
}
