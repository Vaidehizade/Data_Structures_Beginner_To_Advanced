package sorting;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {40,60,20,30,10};
        int n = 5;
        for(int i=0; i<n-1; i++){
            int pos = arr[i];
            int min_position = i;
            //minimum element
        for(int j=i; j<n; j++){
            if(arr[j] < arr[min_position]){
                min_position = j;
            }
        }
        int temp = arr[min_position];
        arr[min_position] = arr[i];
        arr[i] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
            //last element get automatically sorted.
        }
    }
}
