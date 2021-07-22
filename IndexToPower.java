// ToPower Exercise //

import java.util.*;

public class IndexToPower {

    public static int[] toPower(int size, int power) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.pow(i, power);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arrayList = toPower(4, 2);
        System.out.println(Arrays.toString(arrayList));
    }

}
