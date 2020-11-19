import java.util.ArrayList;
import java.util.List;

/**
 * @author:liuwei
 */
public class DemoOne {
    public static void main(String[] args) {
        System.out.println("liuwei");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.forEach(System.out::print);

    }
}