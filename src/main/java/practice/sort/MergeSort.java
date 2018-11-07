package practice.sort;

import practice.interfaces.Sort;

public class MergeSort implements Sort {
    public static void main(String[] args) {
        Sort sort = new MergeSort();
        int[] arr = new int[]{0, -1, 55, 2, 0, 2, 10};
        sort.execute(arr);
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + right / 2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int lSize = middle - left + 1;
        int rSize = right - middle;
        int L[] = new int[lSize];
        int R[] = new int[rSize];
        for (int i = 0; i < lSize; i++) {
            L[i] = arr[left + i];
        }
        for (int i = 0; i < rSize; i++) {
            L[i] = arr[middle + i];
        }
        int lIndex = 0;
        int rIndex = 0;
        int mergedIndex = left;
        while (lIndex < lSize && rIndex < rSize) {
            if (L[lIndex] <= R[rIndex]) {
                arr[mergedIndex] = L[lIndex];
                lIndex++;
            } else {
                arr[mergedIndex] = R[rIndex];
                rIndex++;
            }
            mergedIndex++;
        }
        while (lIndex < lSize) {
            arr[mergedIndex] = L[lIndex];
            lIndex++;
            mergedIndex++;
        }
        while (rIndex < rSize) {
            arr[mergedIndex] = R[rIndex];
            rIndex++;
            mergedIndex++;
        }
    }

    @Override
    public void execute(int[] arr) {
        long startTime = startTime();
        sort(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        long totalTime = endTime() - startTime;
        System.out.print("Total Time: " + totalTime);
    }
}
