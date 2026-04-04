package Bit_Manipulation;

public class Fast_exponentiation {
    public static void main(String[] args) {
        int ans = 1;
        int n = 9;
        int a = 3; 
        // 3^9
        while(n > 0){
            int last_bit = n&1;
            if(last_bit >0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        System.out.println(ans);
    }
}
