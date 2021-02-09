package Solution;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IfElseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vitejte v kalkulacce");
        System.out.println("Zadejte prvni cislo");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte druhe cislo");
        float b = Float.parseFloat(sc.nextLine());
        System.out.println("Zvolte si operaci: ");
        System.out.println("1 - scitani");
        System.out.println("2 - odcitani");
        System.out.println("3 - nasobeni");
        System.out.println("4 - deleni");
        int volba = Integer.parseInt(sc.nextLine());
        float vysledek = 0;
        if (volba == 1) {
            vysledek = a + b;
        } else if (volba == 2) {
            vysledek = a - b;
        } else if (volba == 3) {
            vysledek = a * b;
        } else if (volba == 4) {
            vysledek = a / b;
        }
        if ((volba > 0) && (volba < 5)) {
            System.out.println("Vysledek: " + vysledek);
        } else {
            System.out.println("Neplatna volba");
        }
        System.out.println();
        System.out.println("Dekuji za pouziti kalkulacky");
    }
}


