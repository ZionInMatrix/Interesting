package HomeWork;

import java.util.Scanner;

public class Smailiki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = ":-)";
        String b = ":-(";
        String c = ":-*";
        String d = ":-P";
        System.out.println("Zadej smajlika: ");
        String z = scanner.nextLine();
        if (z == a) {
            System.out.println("Tvuj smajlik je vesely ");
        } else if (z == b) {
            System.out.println("Tvuj smajlik je smutny ");
        } else if (z == c) {
            System.out.println("Tvuj smajlik je zamilovany");
        } else if (z == d) {
            System.out.println("Tvuj smajlik je neznamy");
        } else {
            System.out.println("Tvuj smajlik neznamy");
        }
    }
}

