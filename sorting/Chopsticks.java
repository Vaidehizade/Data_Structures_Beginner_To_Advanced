package sorting;

import java.util.Arrays;

public class Chopsticks {
    public static void main(String[] args) {
        int[] arr = {1,3,3,9,4,2};
        int D = 2;
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n-1;){
            if(arr[i+1]- arr[i] <= D){
                count++;
                i+=2;
            }
            else{
                i++;
            }
        }
        System.out.println(count);

    }
}
