package timsortinarray;

public class TimSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Before sorting:");
        printArray(array);

        timSort(array);

        System.out.println("\nAfter sorting:");
        printArray(array);
    }

    public static void timSort(int[] arr) {
        int minRun = 32; // Minimum size to trigger merge sort

        int n = arr.length;

        // Insertion Sort for small size arrays
        for (int i = 0; i < n; i += minRun) {
            insertionSort(arr, i, Math.min((i + minRun - 1), (n - 1)));
        }

        // Perform merging
        for (int size = minRun; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));

                if (mid < right) {
                    merge(arr, left, mid, right);
                }
            }
        }
    }

    // Insertion Sort
    private static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Merge operation
    private static void merge(int[] arr, int left, int mid, int right) {
        int len1 = mid - left + 1;
        int len2 = right - mid;

        int[] leftArray = new int[len1];
        int[] rightArray = new int[len2];

        for (int i = 0; i < len1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < len2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < len1 && j < len2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < len1) {
            arr[k++] = leftArray[i++];
        }

        while (j < len2) {
            arr[k++] = rightArray[j++];
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
