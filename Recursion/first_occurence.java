package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

//write a function to find the first occurence of an element in an array!

public class first_occurence {

    // public static int firstOccurence(ArrayList<Integer> ls1, int m, int key){

    //     // base recursion
    //     if(ls1 == null || m == ls1.size()){
    //        return -1;
    //     }
    //     // recursive case    
    //      if(key == ls1.get(m)){
    //        return m;
    //      }
    //     return firstOccurence(ls1, m+1, key);

    // }
    // public static void main(String[] args) {
    //     ArrayList<Integer> ls1 = new ArrayList<>(Arrays.asList(1, 7, 3, 22, 11));
    //     int key = 11;
    //     int ans = firstOccurence(ls1,0,key);
    //     System.out.println(ans);
    // }
    public static int firstOccurence(ArrayList<Integer> ls1 ,int key){
        if(ls1.size() == 0)
        {
            return -1;
        }
        if(ls1.get(0) == key){
            return 0;
        }
        int subIndex = firstOccurence(new ArrayList<>(ls1.subList(1,ls1.size())), key);
        if(subIndex != -1){
            return subIndex + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ls1 = new ArrayList<>(Arrays.asList(1, 7, 3, 22, 11));
        int key = 11;
        int ans = firstOccurence(ls1,key);
        System.out.println(ans);
    }



}
