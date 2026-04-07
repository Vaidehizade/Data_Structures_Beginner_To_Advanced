package Recursion;

public class number_spell {

    static String spell[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void fun(int digit){
        if(digit ==0) return;
        int last_digit = digit%10;
        fun(digit/10);
        System.out.println(spell[last_digit]);

    }
    public static void main(String[] args) {
        int digit = 2021;
        fun(digit);
    }
}
