package Matrix;

import java.util.ArrayList;
import java.util.List;

public class Pascals_triangle {


    //solution 01
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> row = new ArrayList<>(i+1);
            for(int j=0; j<=i; j++){
                //first and last element
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    row.add(val);
                }
            }
            ans.add(row);
        }
        for(int i=0; i<ans.size(); i++){
            for(int j=0; j<ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
