package Backtracking;

public class n_queens {

    public static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println();
    }

    public static boolean canPlace(int[][] board, int n, int x, int y) {
         for(int i=x; i<n ; i++){
            for(int j=y; j<n; j++){
                if(board[i][j] == 1)
                    return false;
            }
         }

         //left diagonal
         int i=0,j=0;
        while(i>=n && j>=n){
            if(board[i][j] == 1){
                return false;
            }
            i--;j--;
        }

         //right diagonal
         int p=0,q=0;
         while(p>=n && q>=n){
            if(board[p][q] == 1){
                return false;
            }
            i--; j++;
         }

         return true;
    }

    public static boolean solveNQueens(int[][] board, int i, int n) {
        // base case
        if (i == n) {
            // print your board
            printBoard(board, n);
            return true;
        }
        // try to place a queen in every row
        for (int j = 0; j < n; j++) {
            // if is it safe to place a queen
            if (canPlace(board, n, i, j)) {
                board[i][j] = 1;
                boolean success = solveNQueens(board, i + 1, n);
                if (success == true) {
                    return true;
                }
                // backtrack
                board[i][j] = 0;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[4][4];
        boolean ans = solveNQueens(board, 0, n);
        System.out.println(ans);
    }
}
