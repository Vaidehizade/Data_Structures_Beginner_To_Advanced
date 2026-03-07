package Arrays;

public class Prefix_sum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int[] prefix_sum = new int[6];
        //prefix sum computation
        prefix_sum[0]= arr[0];
        for(int i=1; i<arr.length; i++){
            
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
        }
        int largestSum = 0;
        for(int i=0; i<prefix_sum.length; i++){
            for(int j=i; j<prefix_sum.length; j++){
            int subarraySum = i>0 ? prefix_sum[j]-prefix_sum[i-1]: prefix_sum[j];
              largestSum = Math.max(largestSum, subarraySum);
            }
        }
        System.out.println(largestSum);
    }
    
}
