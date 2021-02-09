package Solution;

import java.util.Scanner;

public class FloatCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Vitejte v kalkulacce");
        System.out.println("Zadejte prvni cislo");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte druhe cislo");
        float b = Float.parseFloat(sc.nextLine());
        float soucet = a + b;
        float rozdil = a - b;
        float soucin = a * b;
        float podil = a / b;
        System.out.println("Soucet: " + soucet);
        System.out.println("Rozdil: " + rozdil);
        System.out.println("Soucin: " + soucin);
        System.out.println("Podil: " + podil);
        System.out.println("Dekuji za pouziti kalkulacki, aplikaci ukoncite libovolnou klavesnou");

    }
}
