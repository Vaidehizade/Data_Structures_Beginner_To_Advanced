package Arrays;
import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements in sorted order:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to search: ");
        int key = sc.nextInt();
        int left = 0;
        int right = n-1;
        boolean flag = false;
        while(left <= right){

            // correct mid calculation: compute midpoint safely
            // use left + (right - left) / 2 to avoid precedence bugs and overflow
            int mid = left + (right - left) / 2;
            if(arr[mid] == key){
                flag = true;
                break;
            }
            else if(key > arr[mid]){
                left = mid +1;
            }
            else if(key < arr[mid]){
                right = mid-1;
            }
        }
        if(flag == false){
             System.out.println("element not found");
        }
        else{
        System.out.println("element found");
        }

    }
}
