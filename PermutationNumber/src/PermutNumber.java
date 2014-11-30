import java.util.Arrays;

/**
 * Created by Pavel on 30.11.2014.
 */
public class PermutNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int elem = numberOfEl(i);
            System.out.println("elem = " + elem);
            int mass[] = new int[elem];
            System.out.println("mass length = " + mass.length);

            for (int k = 0; k <= mass.length; k++) {
                int sum = i % 10;


                mass = new int[elem];
                System.out.println("mass length = " + mass.length);
                mass[i] = sum;
                i /= 10;
                //if () {
                System.out.println();

                //}
            }
            System.out.println(Arrays.toString(mass));

        }
//        System.out.println(Arrays.toString(mass));
    }


    public static int numberOfEl(int count) {
        int a = count;
        int countElem = 0;
        while (a > 0) {
            int sum = a % 10;
            countElem++;
            a /= 10;
        }
        //System.out.println("count Elem = " + countElem);
        return countElem;
    }
}
