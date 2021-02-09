package HomeWork;


import java.util.Random;

public class DoubleArraySum {
    public static final int N = 5;
    public static final Random random = new Random();

    public static void main(String[] args) {
        int matrix[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("/////////////////");
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (i > j) {
                    System.out.print(matrix[i][j] + " ");
                    sum += matrix[i][j];
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
        System.out.println("/////////////////");
        System.out.println("sum =" + sum);

    }

}