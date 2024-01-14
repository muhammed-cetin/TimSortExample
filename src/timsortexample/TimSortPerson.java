package timsortexample;

import java.util.Comparator;

public class TimSortPerson {
    private static final int MIN_MERGE = 32;

    public static <T> void sort(T[] arr, Comparator<? super T> c) {
        int n = arr.length;
        if (n < 2) {
            return; // Already sorted
        }

        int minRun = minRunLength(n);

        // Sort individual subarrays of size minRun
        for (int i = 0; i < n; i += minRun) {
            int end = Math.min(i + minRun - 1, n - 1);
            insertionSort(arr, i, end, c);
        }

        // Merge subarrays to create larger sorted runs
        for (int size = minRun; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);

                if (mid < right) {
                    merge(arr, left, mid, right, c);
                }
            }
        }
    }

    private static <T> void insertionSort(T[] arr, int left, int right, Comparator<? super T> c) {
        for (int i = left + 1; i <= right; i++) {
            T key = arr[i];
            int j = i - 1;

            while (j >= left && c.compare(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    private static <T> void merge(T[] arr, int left, int mid, int right, Comparator<? super T> c) {
        int len1 = mid - left + 1;
        int len2 = right - mid;

        T[] leftArray = (T[]) new Object[len1];
        T[] rightArray = (T[]) new Object[len2];

        System.arraycopy(arr, left, leftArray, 0, len1);
        System.arraycopy(arr, mid + 1, rightArray, 0, len2);

        int i = 0, j = 0, k = left;

        while (i < len1 && j < len2) {
            if (c.compare(leftArray[i], rightArray[j]) <= 0) {
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

    private static int minRunLength(int n) {
        int r = 0;
        while (n >= MIN_MERGE) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }
}
