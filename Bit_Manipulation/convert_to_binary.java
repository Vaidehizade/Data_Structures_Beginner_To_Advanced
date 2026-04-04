package Bit_Manipulation;

public class convert_to_binary {
    public static void main(String[] args) {
        int num = 17;
        int ans = 0;
        int power = 1;
        while(num >0){
            int last_bit = (num&1);
            ans = ans + (last_bit*power);
            power = power*10;
            num = num >>1;
        }
        System.out.println(ans);
    }
}
