package Solution;

import java.util.Scanner;

public class Smajliki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej smajlik");
        String emoji = sc.nextLine().toUpperCase();
        String output = "";
        switch (emoji) {
            case ":-)":
            case ":)":
                System.out.println("Tvuj smajlik je vesely");
                break;
            case ":-(":
            case ":(":
                System.out.println("Tvuj smajlik je smutny");
                break;
            case ":-*":
            case ":*":
                System.out.println("Tvuj smajlik je zamilovany");
                break;
            case ":-p":
            case ":p":
                System.out.println("Tvuj smajlik je zly");
                break;
            default:
                System.out.println("Tvuj smajlik je neznamy");
                break;
        }
    }
}
