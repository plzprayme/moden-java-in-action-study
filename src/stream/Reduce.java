package stream;

import java.util.List;

public class Reduce {

    public static void reduceRun(List<Dish> dish) {
        // 손쉬운 병렬화
        int count = dish.stream().map(d -> 1).reduce(0, (a,b) -> a + b);
        System.out.println("count by map/reduce: " + count);

        long count2 = dish.stream().count();
        System.out.println("count by count: " + count2);

    }
}
