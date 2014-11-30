import java.util.Arrays;

/**
 * Created by Pavel on 23.11.2014.
 */
public class MultiplyArray {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 7, 9, 10};
        int arr2[] = {3, 6, 11, 15, 25};
        int[] result = getInts(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getInts(int[] arr1, int[] arr2) {
        int result[] = new int[arr1.length + arr2.length];
        int indexLeft = 0;
        int indexRight = 0;

        while (indexLeft + indexRight < result.length) {
            if (indexLeft >= arr2[indexRight]) {
                if (indexLeft > arr1.length) {
                    System.arraycopy(arr2, indexRight, result, indexLeft + indexRight, arr2.length - indexRight);
                }
                result[indexLeft + indexRight] = arr1[indexLeft++];
            }
            if (arr2[indexRight] < arr1[indexLeft]) {
                result[indexLeft + indexRight] = arr2[indexRight++];
            }
        }
        return result;
    }
}
