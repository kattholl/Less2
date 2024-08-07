public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        for (int j : array) {
            System.out.print(j);
        }
    }
}