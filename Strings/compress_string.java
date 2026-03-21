package Strings;

public class compress_string {
    public static void main(String[] args) {
        String s ="aabbbcdd";
        int n = s.length();
        StringBuilder output = new StringBuilder();
        for(int i=0; i<n; i++){
            int count = 1;
            while(i< n-1 && s.charAt(i+1) == s.charAt(i)){
               count++;
               i++;
            }
            output.append(s.charAt(i));
            if(count > 1){
            output.append(count);
            }
        }
        if(output.length() > s.length()){
            System.out.println(s);
        }
        else{
        System.out.println(output.toString());
        }
    }
}
