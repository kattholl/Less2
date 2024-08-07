public class Main {
    public static boolean sum(int num1, int num2) {
        return (num1 + num2 >= 10 && num1 + num2 <= 20);
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 15));
        System.out.println(sum(5, 25));
    }
}