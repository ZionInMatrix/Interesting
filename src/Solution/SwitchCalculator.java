package Solution;


import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vitejte v kalkulacce");
        System.out.println("Zadejte prvni cislo");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte druhe cislo");
        float b = Float.parseFloat(sc.nextLine());
        System.out.println("Zvolte si operaci");
        System.out.println("1 - scitani");
        System.out.println("2 - odcitani");
        System.out.println("3 - nasobeni");
        System.out.println("4 - daleni");
        int volba = Integer.parseInt(sc.nextLine());
        float vysledek = 0;
        switch (volba) {
            case 1:
                vysledek = a + b;
                break;
            case 2:
                vysledek = a - b;
                break;
            case 3:
                vysledek = a * b;
                break;
            case 4:
                vysledek = a / b;
                break;
        }
        if ((volba > 0) && (volba < 5)) {
            System.out.println("Vysledek: " + vysledek);
        } else {
            System.out.println("Neplatna volba");
            {
                System.out.println();
                System.out.println("Dekuji za pouziti kalkulacky");
            }
        }

    }
}
