import java.util.Arrays;

public class exo5 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 2, 8, 1, 9};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int[] array) {
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i = 1; i < array.length; i++) {
                if(array[i-1] > array[i]) {
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
        }
    }
}
