package Arrays;

import java.util.Scanner;

public class Arrays_input_output_update {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        System.out.println("size of array: "+n);

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            arr[i] = arr[i]*2; //updating the array element by multiplying it by 2
        }

        System.out.println("the array elements are:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        float f = sc.nextFloat();
        double d = sc.nextDouble();
        short s = sc.nextShort();
        long l = sc.nextLong();
        String str = sc.next(); //single word till whitespace come
        String str2 = sc.nextLine(); //whole line till enter come
       // char c = sc.nextChar(); //single character. --> this is wrong
       char c = sc.next().charAt(0); //single character. --> this is correct

        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("short: "+s);
        System.out.println("long: "+l);
        System.out.println("string: "+str);
        System.out.println("string2: "+str2);
        System.out.println("char: "+c);
    }
    
}
