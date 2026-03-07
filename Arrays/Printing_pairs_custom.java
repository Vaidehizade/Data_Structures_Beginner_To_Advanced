package Arrays;
import java.util.ArrayList;

public class Printing_pairs_custom {
    public static void main(String[] args) {
             int[] arr = {1,2,3,4,5};
        ArrayList<Pair<Integer,Integer>> list1 = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                list1.add(new Pair<>(arr[i], arr[j]));
            }
        }
        System.out.println("printing all pairs");
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
    }
      //small nested Pair class
    static class Pair<A,B> {
        public final A first;
        public final B second;
        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}
