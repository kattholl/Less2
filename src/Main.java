public class Main {
    public static void main(String[] args) {
        printString("Доброе утро", 5);
    }
    public static void printString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
}