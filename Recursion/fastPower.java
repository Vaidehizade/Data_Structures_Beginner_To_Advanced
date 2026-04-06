package Recursion;

public class fastPower {

    public static int fast_power(int N, int p){
        if(p == 0){
            return 1;
        }
        int subProb = fast_power(N, p/2);
        int subProbq = subProb*subProb;
        if((N & 1 )!= 0){ //odd
            return N*subProbq;
        }
        return subProbq;
    }
    public static void main(String[] args) {
        int N = 11;
        int p = 3;
        System.out.println(fast_power(N,p));
        // log n space and time complexity

    }
}
