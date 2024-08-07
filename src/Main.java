public class Main {
    public static boolean greadYear(int year) {
        if (year % 4==0){
            return true;
        } else if (year % 100==0){
            return false;
        } else {
            return year % 400==0;
        }
    }
    public static void main(String[] args) {
        System.out.println("2000 год: " + greadYear(2000));
        System.out.println("2001 год: " + greadYear(2001));
        System.out.println("2003 год: " + greadYear(2003));
        System.out.println("2008 год: " + greadYear(2008));
    }
}
