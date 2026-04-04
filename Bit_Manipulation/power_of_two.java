package Bit_Manipulation;

import java.util.Scanner;

//how to check whether a number is power of two
public class power_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if((N & (N-1)) == 0){
            System.out.println("N is power of 2");
        }
        else{
            System.out.println("N is not power of 2");
        }
    }
}
