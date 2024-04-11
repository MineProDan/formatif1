public class exo4 {
    public static void main(String[] args) {
        int[] array = new int[9];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;

        print(array);
        System.out.println(sum(array));
        System.out.println(max(array));
    }
    public static void print(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
            if((i+1)%3==0) {
                System.out.println();
            }
        }
    }
    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i<array.length; i++) {
            sum += array[i];
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
