import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllNum {

    public static List<Long> findCommonElements(long A, long B) {
        List<Long> list1 = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();
        List<Long> common = new ArrayList<>();

        for (long i = A; i <= B; i++) {
            if (i % A == 0) {
                list1.add(i);
            }
        }

        for (long i = A; i <= B; i++) {
            if (B % i == 0) {
                list2.add(i);
            }
        }

        for (long num : list1) {
            if (list2.contains(num)) {
                common.add(num);
            }
        }

        Collections.sort(common);
        return common;
    }

    public static void main(String[] args) {
        long A = 2;
        long B = 50;

        List<Long> common = findCommonElements(A, B);
        System.out.println("Common elements: " + common);
    }
}
