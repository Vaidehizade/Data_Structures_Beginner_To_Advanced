package Bit_Manipulation;

public class clear_ith_bit {
    public static void main(String[] args) {
        int number = 11;
        int i = 4;
        int mask = ~(1 << i);
        number = number & mask;
        System.out.println(number);
    }
}
