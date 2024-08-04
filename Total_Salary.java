
/*Problem statement
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), depending upon which the total salary is calculated as:

    Total_salary = Basic + HRA + DA + Allow – PF
where :
HRA   = 20% of basic
DA    = 50% of basic
Allow = 1700 if grade = ‘A’
Allow = 1500 if grade = ‘B’
Allow = 1300 if grade = ‘C' or any other character
PF    = 11% of basic. */

import java.util.Scanner;

public class Total_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basic = scanner.nextInt();
        char grade = scanner.next().charAt(0);

        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double pf = 0.11 * basic;

        int allow;
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double totalSalary = basic + hra + da + allow - pf;
        int roundedTotalSalary = (int)Math.round(totalSalary);

        System.out.println(roundedTotalSalary);
    }
}
