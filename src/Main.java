import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] test = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < test.length; i++) {
            if (test[i] < 6) {
                test[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(test));
    }
}