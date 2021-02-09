package Solution;

import java.util.Scanner;

public class LengthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1, name2;
        int length;
        System.out.printf("Zadej delsi slovo ");
        name1 = scanner.nextLine();
        System.out.println("Zadej kratsi cislo");
        name2 = scanner.nextLine();
        length = (name1.length() - name2.length());
        System.out.printf("Slova se lisi delkou o " + length + " znaku");
    }
}
