import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(27, 33, 45, 42, 81, 11));

        list.add(2, 10);
        System.out.println(list);
    }
}
