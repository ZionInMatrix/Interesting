package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        String word = "I am noob";
        int life = 3;
        char[] filler = new char[word.length()];
        int i = 0;
        while (i < word.length()) {
            filler[i] = '-';
            if (word.charAt(i) == ' ') {
                filler[i] = ' ';
            }
            i++;
        }
        System.out.print(filler);
        System.out.println("     life remaining=" + life);

        Scanner s = new Scanner(System.in); //to read characters

        ArrayList<Character> l = new ArrayList<Character>();

        while (life > 0) {
            char x = s.next().charAt(0);  //character input by user

            if (l.contains(x)) {
                System.out.println("Already entered");
                continue;          //while loop continues
            }

            l.add(x);

            if (word.contains(x + "")) {
                for (int y = 0; y < word.length(); y++) { //this loop will check all indexes for the
                    if (word.charAt(y) == x) {             //the character and will replace '-' by
                        filler[y] = x;                  //the character
                    }
                }
            } else {
                life--;       //life decreases if character entered isn't there in word
            }

            if (word.equals(String.valueOf(filler))) {      // checking if fillers equals word
                System.out.println(filler);
                System.out.println("You won !!!");
            }


            System.out.print(filler);
            System.out.println("     life remaining=" + life);
        }
        if (life == 0) {
            System.out.println("You lose !!!");
        }
    }
}
