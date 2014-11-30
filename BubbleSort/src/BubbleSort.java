import java.util.Arrays;

/**
 * Created by Pavel on 23.11.2014.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,5,8,3,2,0};

        SortArrRight(arr);
        System.out.println(Arrays.toString(arr));

        SortArrLeft(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void SortArrRight(int array[]) {
        for (int k = 0; k < array.length - 1; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;

                }
            }
        }
    }

    public static void SortArrLeft(int array[]) {
        for (int k = 0; k < array.length - 1; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }

            }
        }
    }
}
