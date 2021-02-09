package HomeWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TriangleArea {
    static void area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        s = s * (s - a) * (s - b) * (s - c);
        System.out.println("Area of the triangle is " + Math.sqrt(s));
    }

    // Function to read user input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c;
        System.out.println("Enter the three sides of the triangle \n");
        try {
            a = Double.parseDouble(br.readLine());
            b = Double.parseDouble(br.readLine());
            c = Double.parseDouble(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Input");
            return;
        }
        area(a, b, c);
    }
}