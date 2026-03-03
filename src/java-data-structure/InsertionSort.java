public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 3, 4, 1, 2};
        insertionSort(data);

        System.out.println("Sorted array: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
