package stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Filter {
    public static int mul(Integer i) {
        return i * i;
    }

    public static void filterRun() {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        System.out.println("distinct"); // 2 4
        numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
        System.out.println("no distinct"); // 2 2 4
        numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        List<Integer> a = Arrays.asList(1,2,3,4,5);
        System.out.println(a.stream().map(Filter::mul).collect(toList())); // 제곱근만들기

        List<Integer> b = Arrays.asList(1,2,3);
        List<Integer> c = Arrays.asList(4,5);

        List<int[]> pairs = b.stream().flatMap(i -> c.stream().map(j -> new int[]{i , j})).collect(toList());
        for ( int[] i : pairs) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
