package Arrays;

public class Sorted_pair_sum {
    public static void main(String[] args) {
        Pair<Integer,Integer> p1 = new Pair<>(0,0);
        int sum =0; 
        int max_sum = Integer.MIN_VALUE;
        int[] arr = {10,22,28,29,30,40};
        int val = 54;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                sum = arr[i] + arr[j];
                if(sum <=val){
                    max_sum = Math.max(sum,max_sum);
                    p1.first = arr[i];
                    p1.second = arr[j];
                }
            }
            sum =0;
        }
        System.out.println("sorted pair sum which is closest to x: "+ p1.first) ;
        System.out.println("sorted pair sum which is closest to x: "+ p1.second) ;

    }    
}
class Pair<K, V> {

    K first;
    V second;

    Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
}
