package Bit_Manipulation;

public class Clear_last_bit {
    public static void main(String[] args) {
        int i = 3;
        int number = 34;
        int mask = ~(0) << i;
        number = number & mask;
        System.out.println(number);
    }
}
