package Backtracking;

public class grid_ways {

    public static int solve(int[][] grid, int m, int n, int i, int j)
    {
        if(i==m || j== n){
            return 1;
        }
        if(j>= n || i >= m){
          return 0;
        }
        int ans = solve(grid,m,n,i+1,j) + solve(grid,m,n,i,j+1);
        return ans;

    }
    public static void main(String[] args) {
        int[][] grid = new int[5][5];
        int m =5;
        int n =5;
        System.out.println(solve(grid,m,n,0,0));
        
    }
}
