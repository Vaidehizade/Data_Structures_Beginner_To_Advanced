package Recursion;

public class Bubble_sort_2 {
    public static void bubble_sort_rec(int[] arr, int n, int j){
       if(n==1){
          return ;
       }

       if(j==n-1){
        bubble_sort_rec(arr, n-1, 0);
        return;
       }

       if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
       bubble_sort_rec(arr,n-1,j+1);

    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        bubble_sort_rec(arr,5,0);
    }
}
