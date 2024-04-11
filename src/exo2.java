public class exo2 {
    public static void main(String[] args) {
        String[] array = new String[]{"Daniel", "Daniel 2", "daniel 3"};
        System.out.println(pos(array, "Daniel 3"));
    }
    public static int pos(String[] array, String key) {
        int index = -1;
        for(int i = 0; i<=array.length-1; i++) {
            if(key == array[i]) {
                index = i;
            }
        }
        return index;
    }
}
