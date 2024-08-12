import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        int colorValue = -50;
        printColor(colorValue);
        compareNumbers();
        System.out.println(sum(5, 15));
        System.out.println(sum(5, 25));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = scanner.nextInt();
        checkNumber(a);
        System.out.println(isNegative(-1));
        System.out.println(isNegative(0));
        printString("Доброе утро", 5);
        System.out.println("2000 год: " + greadYear(2000));
        int[] array = {0, 1, 0, 0, 1, 0, 1, 0, 1, 0};
        arrayNon(100);
        nomArray(array);
        boArray();
        loMatrix();
        int[] creatArray = doArray(4, 7);
        System.out.println("Созданный массив: " + Arrays.toString(creatArray));
    }
    // метод printThreeWords()
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //метод checkSumSign()
    public static void checkSumSign() {
        int a = -9;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //метод printColor()
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //метод compareNumbers()
    public static void compareNumbers() {
        int a = 12;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    // метод, принимающий на вход два целых числа
    public static boolean sum(int num1, int num2) {
        return (num1 + num2 >= 10 && num1 + num2 <= 20);
    }
    //метод, которому в качестве параметра передается целое число
    public static void checkNumber(int a) {
        if (a > 0) {
            System.out.println("Положительное число");
        } else if (a == 0) {
            System.out.println("Ноль");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    //метод, которому в качестве параметра передается целое число
    public static boolean isNegative(int number) {
        return number < 0;
    }
    //метод, которому в качестве аргументов передается строка и число
    public static void printString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
    //метод, который определяет, является ли год високосным
    public static boolean greadYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 400 == 0;
        }
    }
    //целочисленный массив, состоящий из элементов 0 и 1
    public static void nomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
        //пустой целочисленный массив длиной 100
        public static void arrayNon(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
            System.out.println(Arrays.toString(arr));
        }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    public static void boArray() {
        int[] test = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < test.length; i++) {
            if (test[i] < 6) {
                test[i] *= 2;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(test));
    }

    //квадратный двумерный целочисленный массив
    public static void loMatrix() {
        int k = 5;
        int[][] matrix = new int[k][k];
        for (int i = 0; i < k; i++) {
            matrix[i][i] = 1;
        }
        System.out.println("Квадратный двумерный массив:");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // метод, принимающий на вход два аргумента: len и initialValue
    public static int[] doArray(int length, int initialValue) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}