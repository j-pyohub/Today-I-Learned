public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if(left>=right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int t = 0; t < temp.length; t++) {
            arr[left + t] = temp[t];
        }
    }

    public static void main(String[] args) {
        int[] data = {38, 28, 43, 3, 9, 82, 10};
        mergeSort(data, 0, data.length - 1);

        System.out.println("Sorted array: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
