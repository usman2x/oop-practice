package practice.interfaces;

public interface Sort {
    void execute(int[] arr);

    default void print(int[] arr) {
        long startTime = startTime();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        long totalTime = endTime() - startTime;
        System.out.print("Total Time: " + totalTime);
    }

    default long startTime() {
        return System.currentTimeMillis();
    }

    default long endTime() {
        return System.currentTimeMillis();
    }
}
