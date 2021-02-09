package Solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NameLength {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader2.readLine();
        int n1 = name1.length();
        int n2 = name2.length();
        String n = "";
        if (name1.equals(name2)) {
            n = "Имена идентичны";
            System.out.println(n);
        } else if (n1 == n2) {
            n = "Длины имен равны";
            System.out.println(n);
        }

    }
}

