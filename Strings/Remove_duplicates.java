package Strings;

import java.util.Set;
import java.util.TreeSet;

public class Remove_duplicates {
        public static String removeDuplicate(String s) {
        Set<Character> set = new TreeSet<>();

        //can only iterate over array so simply s nahi ilihu shkt we have to use 
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        String res = "";
        for (char c : set) {
            res += c;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(removeDuplicate(s)); // efgkors
    }
}
