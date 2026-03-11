package sorting;

import java.util.ArrayList;

public class Counting_sort {
    public static void main(String[] args) {
        int largest = -1;
        int[] arr = {5,8,3,1,1,2,8};
        int n=7;
        for(int i=0; i<n; i++){
            largest = Math.max(largest,arr[i]);
        }
        ArrayList<Integer> ls = new ArrayList<>(largest+1);
         // initialize frequency list with 0
        for(int i = 0; i <= largest; i++){
            ls.add(0);
        }
        //updatng the freq array

        for(int x: arr){
            ls.set(x,ls.get(x)+1);
        }
        //put back the elements from freq array into original array
        int j=0;
        for(int i=0; i<=largest; i++){
            while(ls.get(i)>0){
                arr[j] = i;
                ls.set(i,ls.get(i)-1);
                j++;
            }
        }
         for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        
    }
}
