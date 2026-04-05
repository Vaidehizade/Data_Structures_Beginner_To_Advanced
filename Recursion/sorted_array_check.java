// package Recursion;
// import java.util.*;

// public class sorted_array_check{


//     // public static boolean funchk(new ArrayList(), n){
//     //     if(n == 0 | n==1){
//     //      return true;
//     //     }
//     //     if(arr[0] < arr[1] & funchk(i+1,n-1)){
//     //         return true;
//     //     }
//     //     return false;
//     // }
//     // public static void main(String[] args) {
//     //     ArrayList<Integer> ls1 = new ArrayList();
//     //     boolean bl = funchk(ls1);
//     // }



// }

// ...existing code...
package Recursion;
import java.util.*;

public class sorted_array_check {

    // check if list is sorted (non-decreasing) starting from index i
    public static boolean funchk(ArrayList<Integer> arr, int i) {
        if (arr == null) return true;
        if (i >= arr.size() - 1) return true; // 0 or 1 element left -> sorted
        if (arr.get(i) <= arr.get(i + 1) && funchk(arr, i + 1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ls1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        boolean bl = funchk(ls1, 0);
        System.out.println(bl);
    }
}