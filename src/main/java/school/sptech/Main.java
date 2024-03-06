package school.sptech;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        
        Sort.insertion(arr);
        Sort.bubble(arr);
        Sort.selection(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int value = Search.binarySearch(arr, 6);
        System.out.println("\n"+ value);
    }
}