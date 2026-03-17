package Matrix;

import java.util.ArrayList;

public class Spiral_print {
    public static void main(String[] args) {
        int m = 4; //no of rows
        int n = 5; //no of columns
        int startRow= 0;
        int endCol = n-1;
        int startCol = 0;
        int endRow = m-1;
        ArrayList<<int>> arr = new ArrayList<>();
        while(startCol <= endCol && startRow <= endRow){
          

            //startRow
            for(int col = startCol; col<= endCol; col++){
                System.out.println(arr[startCol][col]);
            }

            //startCol
            for(int row = startRow+1; row<= endRow; row++){
             
                System.out.println(arr[row][endCol]);
            }

            // |
            for(int col2= endCol-1; col2 >= startCol; col2--){
                if(startRow == endRow){
                    break;
                }
                System.out.println(arr[endRow][col2]);
            }

            //start col
            for(int row= endRow-1; row >= startRow+1; row--){
                if(startCol == endCol){
                    break;
                }
                System.out.println(arr[row][startCol]);
                //row is same changed the column
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

    }
}
