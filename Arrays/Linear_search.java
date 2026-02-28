package Arrays;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("key found at index: "+i);
                return;
            }
        }
        System.out.println("key not found");
    }
}
