package Divide_and_conquer;

public class Quick_sort {
    
    public static int partition(int[] arr, int s, int e){
        int pivot = arr[e];
        int i = s-1;
        for(int j=s; j<e; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tem = arr[i+1];
        arr[i+1]= arr[e];
        arr[e] = tem;
        return i+1;
    }
    public static void quick_sort(int[] arr, int start, int end){
        if(start >= end) return;
        int p = partition(arr,start,end);
        quick_sort(arr, start, p-1);
        quick_sort(arr, p+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,0,7,6,4};
        int n = arr.length-1;
        quick_sort(arr,0,n);

        for(int x: arr){
            System.out.println(x);
        }
    }
}
