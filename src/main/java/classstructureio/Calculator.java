package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        String message = "Write down the first number";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String message2 = "Write down the second number";
        System.out.println(message2);
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner.nextInt();

        System.out.println(number + " + " + number2);
        System.out.println(number + number2);
    }

}

