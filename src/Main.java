public class Main {
    public static void main(String[] args) {
        int k = 5;
        int[][] matrix = new int[k][k];
        for (int i = 0; i < k; i++) {
            matrix[i][i] = 1;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}