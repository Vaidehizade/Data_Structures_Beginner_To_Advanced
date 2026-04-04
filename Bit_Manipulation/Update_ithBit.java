package Bit_Manipulation;

public class Update_ithBit {
    public static void main(String[] args) {
        int n = 30;
        int i = 3;
        int value = 2; // value you want to put
        clearIthBit(n,i);
        int mask = (value << i);
        n = n | mask;  //sets the right value
        System.out.println(n);

    }
}
