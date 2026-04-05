package Bit_Manipulation;

public class count_set_bits_faster {
   public static void main(String[] args) {
    int cnt =0;
    int n = 111;
    while(n > 0){
        //removes the last set bit from current number
        //the number of itertion = no of set bits
        n = n & (n-1);
        cnt ++;
    }
    System.out.println(cnt);
   }    
}
