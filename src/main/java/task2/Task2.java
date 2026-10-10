package task2;

import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int n = input.nextInt();
        int count = 0;

        System.out.print("Even numbers:");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // jodi even hoy
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Count: " + count);

        input.close();
    }
}