package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchFamilySimpsons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] simpsons = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
        System.out.println("Zadej Simpsna (z rodiny Simpsnu):");
        String simpson = sc.nextLine();

        Arrays.sort(simpsons);
        int pozice = Arrays.binarySearch(simpsons, simpson);
        if (pozice >= 0)
            System.out.println("Jo, to je Simpson!");
        else
            System.out.println("Hele, tohle neni Simpson!");
    }
}
