
public class Sort {

    static final int N = 100;
    static int[] arr;

    public Sort() {
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = N - i;
        }
    }

    void swap() {

    }

    // Implementation of Insertion Sort
    int[] insertionSort(int[] arr) {

        // Initialize an array to return for statistics
        // [0]: Total accesses
        // [1]: Expected accesses based on complexity
        int[] statistics = new int[2];
        //Initialize a counter to measure the total actions taken
        int counter = 0;

        for (int i = 1; i < N; i++) {
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

    public static void main(String[] args) throws Exception {
        Sort s = new Sort();
        int[] statistics = s.insertionSort(arr);
        for (int i = 0; i < N; i++) {
            System.out.println(s.arr[i]);
        }
        System.out.println(statistics[0]);
        System.out.println(statistics[1]);
        
    }
}