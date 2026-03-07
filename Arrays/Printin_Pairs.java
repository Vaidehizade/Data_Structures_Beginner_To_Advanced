package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Printin_Pairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<int[]> list1 = new ArrayList<>(); // initialize, store pairs as int[]
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                list1.add(new int[] { arr[i], arr[j] }); // add pair
            }
        }
        System.out.println("printing all pairs");
        for(int i = 0; i < list1.size(); i++){
            System.out.println(Arrays.toString(list1.get(i))); // get + print
            //System.out.println(list1.get(i));  --> this will return object 
        }
    }
}