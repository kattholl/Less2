import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[100];
        for (int i=0; i < arr.length; i++){
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
    }
}