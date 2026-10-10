package task6;

import java.util.Scanner;

public class Task6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer N >= 2: ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("N must be at least 2");
        } else {
            System.out.print("Prime numbers from 2 to " + n + ": ");

            // 2 theke N porjonto prottek number check korbo
            for (int num = 2; num <= n; num++) {
                boolean isPrime = true;

                // 2 theke num/2 porjonto vag kore dekhbo
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) { // jodi vag jay tahole prime na
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}