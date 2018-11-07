package practice.sort;

import practice.interfaces.Sort;

public class SelectionSort implements Sort {
    public static void main(String[] args) {
        Sort sort = new SelectionSort();
        int[] arr = new int[]{0, -1, 55, 2, 0, 2, 10};
        sort.execute(arr);
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = arr[i];
            int toSwap = i;
            boolean isSwap = false;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    isSwap = true;
                    toSwap = j;
                }
            }
            if (isSwap) {
                int temp = arr[i];
                arr[i] = smallest;
                arr[toSwap] = temp;
            }
        }
        return arr;
    }

    @Override
    public void execute(int[] arr) {
        Sort.super.print(sort(arr));
    }
}
