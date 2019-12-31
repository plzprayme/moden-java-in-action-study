package stream;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void filterRun() {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        System.out.println("distinct"); // 2 4
        numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
        System.out.println("no distinct"); // 2 2 4
        numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    }
}
