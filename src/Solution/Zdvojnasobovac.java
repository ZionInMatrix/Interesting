package Solution;

import java.util.Scanner;

public class Zdvojnasobovac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Zadejte cislo k zasobovani: ");
        String vstup;
        vstup = sc.nextLine();
        String vystup;
        vystup = vstup + ", " + vstup + "!";
        System.out.println(vystup);
    }
}
