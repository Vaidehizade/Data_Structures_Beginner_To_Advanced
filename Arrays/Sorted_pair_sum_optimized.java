package Arrays;

public class Sorted_pair_sum_optimized {
    public static void main(String[] args) {
        int[] arr = {10,22,28,29,30,40};
        int x = 54;
        int start =0, end = arr.length-1;
        int leftIndex =0, rightIndex =0;
        int absoluteDiff = Integer.MAX_VALUE;
        while(start < end){
            int current_sum = arr[start] + arr[end];
            if(abs(current_sum-x) < x){
                leftIndex = start;
                rightIndex = end;
                absoluteDiff = abs(current_sum-x);
            }
            if(current_sum < x){
            start++;
            }
            else{
                end --;
            }
        }
        return {arr[leftIndex,arr[rightIndex]]};
        
    }
}
