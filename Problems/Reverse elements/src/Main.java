import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            Vector<Integer> v = new Vector<>();
            for (int j = 0; j < twoDimArray[i].length; j++) {
                v.add(twoDimArray[i][j]);
            }
            for (int j = 0; j < v.size(); j++) {
                twoDimArray[i][j] = v.get(v.size() - 1 - j);
            }
        }
    }
}
