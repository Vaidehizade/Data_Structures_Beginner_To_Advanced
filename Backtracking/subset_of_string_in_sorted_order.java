package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class subset_of_string_in_sorted_order {

    // public static boolean compare(String a , String b){
    //     if (a.length() == b.length()) {
    //         return a < b;
    //     }
    //     return a.length() <b.length();
    // }
    public static void subset_of_string(String s, int i, int j , int n , StringBuilder output, ArrayList<String>ls){
       if(i == n){
        System.out.println(output.toString());
        ls.add(output.toString());
        return;
       }

       //if character is taken 
    output.append(s.charAt(i));
    subset_of_string(s, i+1, j+1, n, output, ls);
    //if char is not taken
    output.deleteCharAt(output.length()-1);
    subset_of_string(s, i+1, j, n, output, ls);
    }
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        StringBuilder output = new StringBuilder();
        ArrayList<String> ls = new ArrayList<>();
        subset_of_string(s,0,0,n,output,ls);
        //lexicograhically sorted
       //Collections.sort(ls);
       //this is for cpp
    //    sort(ls.begin(),ls.end(),compare);

    Collections.sort(ls, new Comparator<String>() {
        public int compare(String a,String b){
            if(a.length() != b.length()){
                return Integer.compare(a.length(),b.length());
            }
            return a.compareTo(b);
        }
    });
       System.out.println("\nSorted subsets:");
        for (String subset : ls) {
            System.out.println(subset);
        }
    }
}
