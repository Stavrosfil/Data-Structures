public class Searching {

    public Searching() {

    }

    // Serial integer search
    public int serialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Binary search
    public int binarySearch(int[] arr, int key, int low, int high) {
        if (low > high)
            return -1;
        else {
            int mid = (low + high) / 2;
            if (mid == key)
                return mid;
            else if (mid > key)
                return binarySearch(arr, key, low, mid - 1);
            else
                return binarySearch(arr, key, mid + 1, high);
        }
    }
}