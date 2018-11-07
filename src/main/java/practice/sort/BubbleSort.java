package practice.sort;

import practice.interfaces.Sort;

public class BubbleSort implements Sort {
    public static void main(String[] args) {
        Sort sort = new BubbleSort();
        int[] arr = new int[]{0, -1, 55, 2, 0, 2, 10};
        sort.execute(arr);
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public void execute(int[] arr) {
        System.out.println("Bubble Sort");
        Sort.super.print(sort(arr));
    }
}
