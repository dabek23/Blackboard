package SortingAlorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{0, 5, 6, 3, 19, 7, 13};

        System.out.println(Arrays.toString(bubbleSort.sort(array)));
    }
}
