import java.util.Arrays;
public class exo1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        System.out.println(sum(array));
        System.out.println(max(array));



    }
    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
    public static int max(int[] array) {
        int max = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
