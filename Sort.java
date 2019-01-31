
public class Sort {

    public Sort() {
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    // Implementation of Insertion Sort
    int[] insertionSort(int[] arr) {

        // Initialize an array to return for statistics
        // [0]: Total accesses
        // [1]: Expected accesses based on complexity
        int[] statistics = new int[2];
        // Initialize a counter to measure the total actions taken
        int counter = 0;

        for (int i = 1; i < arr.length; i++) {
            // Temporary index
            int j = i;
            // The number we want to place right now
            int x = arr[i];
            // While the previous number is larger than the one we care abouts
            while (j > 0 && (arr[j - 1] > x)) {
                // Swap the two numbers
                arr[j] = arr[j - 1];
                // Move backwards
                j--;
                counter++;
            }
            // Place the number in the right spot
            arr[j] = x;
            counter++;
        }

        statistics[0] = counter;
        // Insertion sort is an O(n^2) algorithm.
        statistics[1] = arr.length * arr.length;

        return statistics;
    }

    // Implementation of Bubble Sort
    int[] bubbleSort(int[] arr) {
        // Flag for complexity optimization
        int flag = 1;
        // We repeat the proccess N-1 times, where N: array length.
        for (int i = 0; i < arr.length - 1; i++) {
            // This for loop is i times smaller because the i elements in the right of the
            // array are already sorted and we don't need to check those.
            for (int j = 0; j < arr.length - i - 1; j++) {
                // If current element is larger than the next one, swap them.
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                    flag = 0;
                }
            }
            // If no change happened, array is sorted.
            if (flag == 1)
                break;
        }

        return null;
    }
}