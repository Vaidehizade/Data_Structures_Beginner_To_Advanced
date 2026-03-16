package Strings;

public class Largest_string_02 {
    public static void main(String[] args) {
        String[] arr = {"Vaidehi","rekha","Yash","Meera","Bindi"};
        // String largest = "";
        // for(String s: arr){
        //     if(s.length() > largest.length()){
        //         largest = s;
        //     }
        // }
        // System.out.println(largest);

        String largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i].compareTo(largest) > 0){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
