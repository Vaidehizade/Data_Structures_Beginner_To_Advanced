package Bit_Manipulation;

public class count_set_bits {
    public static void main(String[] args) {
        int n = 11;
        int cnt =0;
        while(n > 0){
            int last_bit = (n & 1);
            cnt += last_bit;
            n = n >>1;
        }
        System.out.println(cnt);
        //this loop is going to take log(N) time bits mule
    }
}
