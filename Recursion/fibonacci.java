package Recursion;

public class fibonacci {

    public static int fibonacci(int num){
        if(num==0 | num==1)
        {
            return 1;
        }
        int a = fibonacci(num-1);
        int b = fibonacci(num-2);
        return a+b;
    }
    public static void main(String[] args) {
        int n = 12;
        int ans = fibonacci(n);
        System.out.println(ans);
    }
}
