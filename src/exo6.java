import java.util.ArrayList;
import java.util.List;

public class exo6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(4);
        System.out.println(sum(list));
        System.out.println(max(list));
    }
    public static int sum(List<Integer> list) {
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
    public static int max(List<Integer> list) {
        int max = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
