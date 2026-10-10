package task3;

import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer N between 0 and 12: ");
        int n = input.nextInt();

        // check jodi 0-12 er moddhe hoy
        if (n < 0 || n > 12) {
            System.out.println("Please enter a number between 0 and 12");
        } else {
            long factorial = 1; // long nilam karon 12! onek boro

            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + n + " = " + factorial);
        }

        input.close();
    }
}