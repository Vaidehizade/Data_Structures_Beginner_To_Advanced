package sorting;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {40,30,20,10,9};
        int n = 5;
        for(int i=1; i<n; i++){
            int current_ele = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > current_ele){
                arr[prev+1] = arr[prev];
                prev = prev-1;
            }
            arr[prev+1] = current_ele;
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
