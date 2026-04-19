package Backtracking;

import java.util.*;

public class sudoku {

    public static boolean isSafe(int[][] mat, int i, int j, int no, int n) {

        // row + column check
        for (int k = 0; k < n; k++) {
            if (mat[k][j] == no || mat[i][k] == no) {
                return false;
            }
        }

        // subgrid check
        //generalize method
        // int root = (int)Math.sqrt(n);
        // int sx = (i / root) * root;
        // int sy = (j / root) * root;

        // 3 is for n =9
        int sx = (i / 3) * 3;
        int sy = (j / 3) * 3;

        for (int x = sx; x < sx + 3; x++) {
            for (int y = sy; y < sy + 3; y++) {
                if (mat[x][y] == no) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean solveSudoku(int[][] mat, int i, int j, int n) {

        // base case
        if (i == n) {
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    System.out.print(mat[x][y] + " ");
                }
                System.out.println();
            }
            return true;
        }

        // move to next row
        if (j == n) {
            return solveSudoku(mat, i + 1, 0, n);
        }

        // skip filled cells
        if (mat[i][j] != 0) {
            return solveSudoku(mat, i, j + 1, n);
        }

        // try all numbers
        for (int no = 1; no <= 9; no++) {
            if (isSafe(mat, i, j, no, n)) {
                mat[i][j] = no;

                if (solveSudoku(mat, i, j + 1, n)) {
                    return true;
                }
            }
        }

        // backtrack
        mat[i][j] = 0;
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 9;
        int[][] mat = new int[n][n];

        // input (use 0 for empty cells)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        if (!solveSudoku(mat, 0, 0, n)) {
            System.out.println("No solution exists");
        }
    }
}