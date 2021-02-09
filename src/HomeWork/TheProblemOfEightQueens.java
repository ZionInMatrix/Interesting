package HomeWork;

import java.util.Scanner;

public class TheProblemOfEightQueens {

    public static int N = 5;

    static void printBoard(int[][] board) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (board[i][j] == 1) {
                    System.out.print("Q\t");
                } else {
                    System.out.print("_\t");
                }
            System.out.println();
        }
    }

    static boolean toPlaceOrNotToPlace(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] != 1) {
                continue;
            }
            return false;
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] != 1) {
                continue;
            }
            return false;
        }
        for (int i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }

    static boolean theBoarSolver(int[][] board, int col) {
        if (col >= N)
            return true;
        for (int i = 0; i < N; i++) {
            if (!toPlaceOrNotToPlace(board, i, col)) {
                continue;
            }
            board[i][col] = 1;
            if (theBoarSolver(board, col + 1))
                return true;
            board[i][col] = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("State the value of N in this program!");
        N = sc.nextInt();
        int[][] board = new int[N][N];
        if (theBoarSolver(board, 0)) {
            System.out.println("Solution not found");
        }
        printBoard(board);
    }

}
