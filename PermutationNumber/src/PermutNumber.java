import java.util.Arrays;

/**
 * Created by Pavel on 30.11.2014.
 */
public class PermutNumber {
    public static void main(String[] args) {
        /*for (int i = 0; i<100;i++){
            if () {
                System.out.println(i);
            }
        } */

        int x = 123456;
        //int sum = 0;
        int mass [] = new int[7];
        for (int i=0;i>5;i++){
           int sum = x % 10;
            mass[i]=sum;
            x /= 10;
        }
        System.out.println(Arrays.toString(mass));
    }
}
