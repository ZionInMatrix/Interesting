package HomeWork;

import java.util.Scanner;

public class AreaPerimeterLengthOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        double length = sc.nextDouble();

        sc.close();

        double area = length * length;
        double perimeter = 4 * length;
        double diagonal = Math.sqrt(2) * length;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Length of diagonal: " + diagonal);

    }
}

