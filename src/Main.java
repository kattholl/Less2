public class Main {
    public static void main(String[] args) {
        System.out.println(isNegative(-1));
        System.out.println(isNegative(0));
    }
    public static boolean isNegative(int number) {
        return number < 0;
    }
}