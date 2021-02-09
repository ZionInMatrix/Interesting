package HomeWork;

import java.util.Scanner;

public class CalculateMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        float[] c = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("zadejte " + (i + 1) + " cislo");
            c[i] = sc.nextFloat();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(c[i] + " od median " + (c[i] - c[(n / 2)]));
        }
    }
}
