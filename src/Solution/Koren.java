package Solution;

import java.util.Scanner;

public class Koren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte nejake cislo ze ktereho spocitam odmocinu");
        int a = Integer.parseInt(sc.nextLine());
        if (a > 0) {
            System.out.println("Zadal jsi cislo vetsi nez 0, to znamena, ze ho mohu odmocnit");
            double o = Math.sqrt(a);
            System.out.println("Odmocnina z cisla " + a + " je " + o);
        } else {
            System.out.println("Odmocina ze zaporneho cisla neexistuje");
        }
        System.out.println("Dekuji za zadani");
    }
}



