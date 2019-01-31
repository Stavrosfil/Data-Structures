import Sort;

public class Main {

    static final int N = 10;
    static int[] arr;

    public static void main(String[] args) {

        arr = new int[N];
        // Initialize array with descending order
        for (int i = 0; i < N; i++) {
            arr[i] = N - i;
        }

        Sort s = new Sort();
        s.bubbleSort(arr);
        // int[] statistics = s.bubbleSort(arr);
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
        // System.out.println(statistics[0]);
        // System.out.println(statistics[1]);

    }

}