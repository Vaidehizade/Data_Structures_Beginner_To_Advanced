package Backtracking;

public class permutations_of_string {
    public static void permute(char[] ans, int i, int len){
        //base case
        if(i==len){
            System.out.println(new String(ans));
            return;
        }
        //recursive case
         // recursive case: swap current position with all positions from i onwards
        for(int j=i; j< len; j++){
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            permute(ans, i+1, len);
            //backtrack
        temp = ans[i];
        ans[i] = ans[j];
        ans[j] = temp; 

    }
}
    public static void main(String[] args) {
        String st = "ABC";
        int n = st.length();
        permute(st.toCharArray(),0, n);
    }
}
