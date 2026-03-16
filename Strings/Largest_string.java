package Strings;

import java.util.ArrayList;

//brute_force 01
public class Largest_string{
    public static void main(String[] args) {
        String[] arr = {"Vaidehi","rekha","Yash","Meera","Bindi"};
        int max_ele = Integer.MIN_VALUE;
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            ls.add(arr[i].length());
        }
        String res = "";
        for(int j=0; j<ls.size(); j++){
            if(ls.get(j) > max_ele){
                max_ele = ls.get(j);
                res = arr[j];
            }
        }
        System.out.println("maximum length string: "+res);
        System.out.println(max_ele);
        
    }
}