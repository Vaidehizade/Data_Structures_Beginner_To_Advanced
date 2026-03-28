package Matrix;
import java.util.*;

public class WavePrint {

    public static List<Integer> wavePrint(int m, int n, int[][] arr) {
        List<Integer> res = new ArrayList<>();

        for (int col = n - 1; col >= 0; col--) {

            if ((n - 1 - col) % 2 == 0) {
                // top → bottom
                for (int row = 0; row < m; row++) {
                    res.add(arr[row][col]);
                }
            } else {
                // bottom → top
                for (int row = m - 1; row >= 0; row--) {
                    res.add(arr[row][col]);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = wavePrint(3, 3, arr);
        System.out.println(result);
    }
}