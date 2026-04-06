package Recursion;

public class power_function {


    public static int helperpow(int N, int p, int ans){
        if(p==0){
            return ans;
        }
        ans = ans * N;
        return helperpow(N, p-1, ans);
    

    }
    public static void main(String[] args) {
        int N = 3;
        int p = 4;
        int ans = 1;
       System.out.println(helperpow(N,p, ans));
    }
}
