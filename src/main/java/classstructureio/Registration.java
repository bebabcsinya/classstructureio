package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        System.out.println("Registration");
        System.out.println("Give us your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Give us your email address");
        String email = scanner.nextLine();
        System.out.println("Successful registration");
        System.out.println(name);
        System.out.println(email);
    }

}
