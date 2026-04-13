package Divide_and_conquer;

public class Merge_sort {

    public static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];
        int i = left;      // left subarray
        int j = mid + 1;   // right subarray
        int k = 0;
        // merge both halves
        while(i <= mid && j <= right) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // remaining left part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining right part
        while(j <= right) {
            temp[k++] = arr[j++];
        }

        // copy back to original array
        for(int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }

    public static void merge_sorts(int[] arr, int left, int right) {

        // base case
        if(left >= right) return;
        int mid = left + (right - left) / 2;
        merge_sorts(arr, left, mid);
        merge_sorts(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void main(String[] args) {

        int[] arr = {30, 40, 7, 8, 2, 1, 99};
        merge_sorts(arr, 0, arr.length - 1);
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}