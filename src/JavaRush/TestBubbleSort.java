package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestBubbleSort {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        String tmp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isGreaterThan(array[j], array[j + 1])) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }
        }

    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}

