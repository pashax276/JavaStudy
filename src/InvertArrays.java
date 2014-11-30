import java.util.Arrays;

/**
 * Created by Pavel on 23.11.2014.
 */
public class InvertArrays {
    public static void main(String[] args) {
        int arr[] = {1, 8, 9, 7, 2};

        System.out.println(Arrays.toString(arr));

        InvertBegin(arr);
        System.out.println(Arrays.toString(arr));

        InvertMiddle(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void InvertBegin(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    }

    public static void InvertMiddle(int[] arr) {
        int count = 0;
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            count++;
            int tmp = arr[i];
            System.out.println("tmp = " + tmp);
            arr[i] = arr[arr.length - i - 1];
            System.out.println("arr[i] = " + arr[i]);
            arr[arr.length - 1 - i] = tmp;
            System.out.println("arr[arr.length - 1] = " + arr[arr.length - 1]);
            System.out.println(count);
        }

    }
}
