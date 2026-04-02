package Bit_Manipulation;

public class get_ithBit {
    public static void main(String[] args) {
        int number = 6;
        int i = 2;
        int mask = (1 << i);
        int bit = ((number & mask) !=0) ? 1 : 0;
        System.out.println(bit);
    }
}
