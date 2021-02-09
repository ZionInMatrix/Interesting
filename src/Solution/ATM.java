package Solution;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadejte bankovku: ");
        int input = sc.nextInt();

        System.out.println("zadejte cislo na vraceni: " + input + "Kc");

        int m50, m20, m10, m5, m2, m1;

        m50 = input / 50;
        input = input % 50;
        m20 = input / 20;
        input = input % 20;
        m10 = input / 10;
        input = input % 10;
        m5 = input / 5;
        m2 = input / 2;
        input = input % 2;
        m1 = input / 1;
        input = input % 1;

        System.out.println(" v mincich\n" +
                m50 + " 50Kc\n" +
                m20 + " 20KC\n" +
                m10 + " 10Kc\n" +
                m5 + " 5Kc\n" +
                m2 + " 2Kc\n" +
                m1 + " 1Kc");
    }
}
