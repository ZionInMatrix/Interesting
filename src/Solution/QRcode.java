package Solution;


import java.util.Scanner;

public class QRcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.length() != 13) {
            System.out.println("Neni platny");
        } else {
            int s1 = 0;
            int s2 = 0;
            for (int i = 0; i < 12; i++) {
                if (i % 2 == 0) {
                    s1 += Character.getNumericValue(line.charAt(i));
                    s2 += Character.getNumericValue(line.charAt(i));
                }
            }
            s2 *= 3;
            int s3 = s1 + s2;
            while (s3 % 10 != 0) {
                s3++;
            }
            System.out.println(s3 - (s1 + s2));
        }
    }
}
