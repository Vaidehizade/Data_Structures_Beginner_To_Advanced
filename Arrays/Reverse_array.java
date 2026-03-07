public class Reverse_array {
    public static void reverse(int[] brr){
         int i = 0, j = brr.length-1;
         while(i<j){
            int temp = brr[i];
            brr[i] = brr[j];
            brr[j] = temp;
            i++;
            j--;
         }
    }
    public static void main(String[] args) {
        System.out.println("reverse array");
        int[] arr = {10,30,50,60,80};
        reverse(arr);
        System.out.println("reverse array with O(1) space complexity");
        for(int x: arr){
            System.out.println(x);
        }
    }
    
}
