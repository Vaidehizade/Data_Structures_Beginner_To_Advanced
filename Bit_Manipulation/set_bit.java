package Bit_Manipulation;
import java.util.*;
public class set_bit {

    //Set ith bit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        int i = 5; //ith bit
        int mask = (1<<i);
        number = number | mask;
        System.out.println(number);
    }
}
