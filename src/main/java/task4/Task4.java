package task4;

public class Task4 {
    static void main(String[] args) {
        int originalNumber = 0;
        int reversedNumber = 0;

        // 10 theke 99 porjonto sob 2-digit number check korbo
        for (int num = 10; num <= 99; num++) {
            int tensDigit = num / 10;   // 48/10 = 4
            int onesDigit = num % 10;   // 48%10 = 8

            // Condition 1: tens digit = ones digit / 2
            // Condition 2: reverse = original + 36
            if (tensDigit == onesDigit / 2.0) {
                reversedNumber = onesDigit * 10 + tensDigit;

                if (reversedNumber == num + 36) {
                    originalNumber = num;
                    break; // peye gesi tai loop off
                }
            }
        }

        System.out.println("The original number is: " + originalNumber);
        System.out.println("The reversed number is: " + reversedNumber);
        System.out.println("Check: " + reversedNumber + " - " + originalNumber + " = " + (reversedNumber - originalNumber));
    }
}