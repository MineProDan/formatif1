import java.util.ArrayList;
import java.util.List;

public class exo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(4);
        System.out.println(sum(list));
        System.out.println(avg(list));
        System.out.println(remove(list));
    }
    public static int sum(List<Integer> list) {
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
    public static float avg(List<Integer> list) {
        int avg = 0;
        for(int i = 0; i < list.size(); i++) {
            avg += list.get(i);
        }
        avg = avg/list.size();
        return avg;
    }
    public static List<Integer> remove(List<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i)%2 == 0) {
                list.remove(i);
                i -= 1;
            }
        }
        return list;
    }
}
