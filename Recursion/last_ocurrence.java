package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

//a function to find the last occurence of an element in an array!
public class last_ocurrence {


   public static int lastOccurence(ArrayList<Integer> ls1, int key){
           if(ls1.size() == 0){
            return -1;
           }
           int subIndex =  lastOccurence(new ArrayList<>(ls1.subList(1, ls1.size())), key);
           if(subIndex != -1){
            return subIndex+1;
           }
           //check current element
           if(ls1.get(0) == key){
            return 0;
           }
           return -1;
        }
    public static void main(String[] args) {
        //we first ask the subarray where is the key?
        //if present then return simply i+1;
        //if the subarray doesn't contain key then taake -1 and check at current arr[0]. ---> if its there return 0 or otherwise return -1
     
        ArrayList<Integer> ls1 = new ArrayList<>(Arrays.asList(10,20,6,8,9,6,11));
        int key = 6;
        int ans = lastOccurence(ls1,key);
        System.out.println(ans);
    }
}
