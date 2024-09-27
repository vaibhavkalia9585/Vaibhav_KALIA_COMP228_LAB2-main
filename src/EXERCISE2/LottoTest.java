package EXERCISE2;

import java.util.Scanner;

public class LottoTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of your choice (between 3 and 27): ");
        String op1 = scanner.nextLine();
        boolean win = false;

        for (int count = 5; count >= 1;) {
            Lotto number = new Lotto();
            int total = 0;

            for (int counter = 0; counter < number.arrayLotto().length; counter++) {
                total += number.arrayLotto()[counter];
            }

            if (total == Integer.parseInt(op1)) {
                System.out.println("Sum: " + total + "\nCongratulations! You are a lucky star!");
                win = true;
                break;
            } else {
                count--;
                System.out.println("Sum: " + total + ".\nYou have " + count + " roll(s) left. Continue?");
            }
        }

        if (!win) {
            System.out.println("Out of 5 rolls. Sorry! I have better luck than you!");
        }

        scanner.close();
    }
}
