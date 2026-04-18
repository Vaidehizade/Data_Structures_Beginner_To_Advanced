package Backtracking;

public class subset_of_string {

    public static void subset(String s, int i, int j, int n, StringBuilder output){
        //base case
         if(i== n){
            System.out.println(output.toString()); 
            return;
         }
         //recurive call
         //if we are taking the character 
         output.append(s.charAt(i));
         subset(s, i+1, j+1, n, output);
         //if we are not taking the character
         //the last character will get overrideen
         output.deleteCharAt(output.length()-1);
         subset(s, i+1, j, n, output);
    }
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder output = new StringBuilder();
        int n = s.length();
        subset(s,0,0,n,output);

    }
}
