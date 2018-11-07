package practice.sort;

import practice.interfaces.Sort;

public class InsertionSort implements Sort {
    public static void main(String[] args) {
        Sort sort = new InsertionSort();
        int[] arr = new int[]{4, -1, 55, 2, 0, 2, 10};
        sort.execute(arr);
    }

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int elementToCompare = arr[i];

            while (j >= 0 && arr[j] > elementToCompare) {
                j = j - 1;
            }
        }
        return arr;
    }

    @Override
    public void execute(int[] arr) {

    }
}
