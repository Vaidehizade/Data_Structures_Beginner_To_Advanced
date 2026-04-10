package Recursion;

public class TillingProblem {

    public static int countWays(int n, int m) {

        // base cases
        // if(n < m) {
        //     return 1;   // only vertical placement possible
        // }

        // if(n == m) {
        //     return 2;   // all vertical OR all horizontal
        // }
        if(n==0 || n==1 || n==2 || n==3)
            return 1;

        // recursive relation
        return countWays(n - 1, m) + countWays(n - m, m);
    }

    public static void main(String[] args) {

        int n = 4;
        int m = 3;

        System.out.println(countWays(n, m));
    }
}
