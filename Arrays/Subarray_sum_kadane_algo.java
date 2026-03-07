package Arrays;

public class Subarray_sum_kadane_algo {
    public static void main(String[] args) {
        int current_sum =0;
        int maximum_sum = 0;
        int[] arr = {-2,3,4,-1,5,-12,6,1,3};
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] <= 0)
        //     {
        //         current_sum += arr[i];
        //         if(current_sum <= 0){
        //             current_sum = 0;
        //         }
        //         else{
        //             maximum_sum = Math.max(current_sum, maximum_sum);
        //         }
        //     }
        //     else {
        //         current_sum += arr[i];
        //         maximum_sum = Math.max(current_sum, maximum_sum);
        //     }
        // }
        // if all elements negative then this is special case for kadane's algo
        boolean allNeg = true;
        int largest_sum = Integer.MIN_VALUE;
        for(int x: arr){
            if(x>0)
            {
                allNeg = false;
            }
            else{
                maximum_sum = Math.max(largest_sum,x);
            }
        }
        if(allNeg){
            System.out.println(maximum_sum);
        }
        else{
        for(int i=0; i<arr.length; i++){
            current_sum += arr[i];
            if(current_sum < 0){
                current_sum = 0;
            }
            maximum_sum = Math.max(maximum_sum,current_sum);
        }
        System.out.println(maximum_sum);
    }
    }
}
