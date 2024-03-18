package school.sptech;

public class Sort{
    public static void byName(Ong[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Ong key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.getName().compareTo(arr[j].getName()) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void byEmail(Ong[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Ong key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.getEmail().compareTo(arr[j].getEmail()) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
