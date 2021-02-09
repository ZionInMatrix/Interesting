package HomeWork;

import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String a, b = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome");
        a = in.nextLine();

        int length = a.length();

        for (int i = length - 1; i >= 0; i--)
            b = b + a.charAt(i);

        if (a.equals(b)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string isn't a palindrome.");
        }
    }
}

