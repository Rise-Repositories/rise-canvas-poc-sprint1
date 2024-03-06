package school.sptech;

public class Search {
    public static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                start = mid - 1;
            } else {
                end = mid + 1;
            }
        }
        return -1;
    }
    
}
