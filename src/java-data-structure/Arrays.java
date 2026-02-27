public class Arrays {
    public static void main(String[] args) {
        int[] arr = {27, 36, 45, 44, 21};

        System.out.println(arr[3]);

        arr[3] = 16;
        for (int value : arr) {
            System.out.print(value+ " ");
        }
        System.out.println();
        //search traverse
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 45) {
                System.out.println(i);
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
