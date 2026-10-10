package task5;

import java.util.Scanner;

public class Task5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height (>=2): ");
        int height = input.nextInt();

        System.out.print("Enter width (>=2): ");
        int width = input.nextInt();

        // check jodi 2 er kom hoy
        if (height < 2 || width < 2) {
            System.out.println("Height and width must be at least 2");
        } else {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    // prothom row, shesh row, prothom column, shesh column = *
                    if (i == 1 || i == height || j == 1 || j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" "); // vitorer gulo space
                    }
                }
                System.out.println(); // new line
            }
        }

        input.close();
    }
}