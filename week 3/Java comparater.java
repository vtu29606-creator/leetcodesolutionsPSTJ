import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        numbers.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;   // ascending
            }
        });

        System.out.println(numbers);
    }
}