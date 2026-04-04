package Bit_Manipulation;

public class Clear_range_of_bits {
    public static void main(String[] args) {
        int i = 11;
        int j = 20;
        int n = 22;
        int a = (~0) << (j+1);
        int b = (1 << i) - 1; // 2^i - 1
        int mask = a | b;
        n = mask & n;
        System.out.println(n);

    }
}
