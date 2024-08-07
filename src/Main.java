public class Main {
    public static void main(String[] args) {
        checkSumSign();
    }
    public static void checkSumSign() {
        int a = -9;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}