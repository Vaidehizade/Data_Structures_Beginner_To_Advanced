package Arrays;

public class Lower_Bound {
    public static void main(String[] args) {
        int[] arr = {-11,20, 23, 26, 89};
        int left = 0; 
        int right = arr.length;
        int val = -11;
        int ans = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] <= val){
                ans = arr[mid];
                left = mid+1;
            }
            else{
                right = mid - 1;
            }
        }
      System.out.println(ans);
    }
}
