package Recursion;

import java.util.ArrayList;

public class Bubble_sort {
    public static void bubble_sort_rec(int[] arr, int n){
       if(n==1){
          return ;
       }
       for(int j=0; j<n-1; j++){
        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
       }
       bubble_sort_rec(arr,n-1);

    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        bubble_sort_rec(arr,5);
    }
}
