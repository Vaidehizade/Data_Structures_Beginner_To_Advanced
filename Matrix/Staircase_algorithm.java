package Matrix;

public class Staircase_algorithm {
    public static void main(String[] args) {
          int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int m=3,n=3;
        int key = 6;
        boolean flag = false;
        if(key < arr[0][0] || key > arr[m-1][n-1]){
            System.out.println("element not found");
        }
        else{
            int i =0, j= n-1;
            while(i <=m-1 && j >= 0){
                if(arr[i][j] == key){
                    
                    flag = true;
                    break;
                }
                else if(key > arr[i][j]){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        if(flag){
      System.out.println("element found");
        }else
        System.out.println("not found!");
    }
}
