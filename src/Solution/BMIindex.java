package Solution;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BMIindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.println("\nInput height in metters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("\nThe Body Mass Index (BMI) is " + BMI + "kg/m2");
    }


}
