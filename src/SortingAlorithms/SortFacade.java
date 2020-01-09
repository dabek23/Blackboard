package SortingAlorithms;

public class SortFacade {
    public static void main(String[] args) {
        int[] first = {4,8,124,16,20};
        int[] second = MergeSort.sort(first);
        for (int i = 0; i < second.length; i++) {
            System.out.println(second[i]);
        }
    }
}
