package Backtracking;

public class basic_backtracking_code01 {

    public static void fillArray(int[] arr, int i, int n, int val){
        if(i==n){
            //print array
        for(int j=0; j<n; j++){
            System.out.print(arr[j]+ " ");
        }
        return;
        }
        arr[i] = val;
        fillArray(arr, i+1,n,val+10);
        //backraking code
        arr[i] = -1*arr[i];
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        fillArray(arr, 0, 5, 10);
    }
}
