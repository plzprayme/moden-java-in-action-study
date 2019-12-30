package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaMain {
    public void run() {
        Supplier<Banana> c1 = Banana::new;
        Banana lambda = c1.get();
        System.out.println(lambda.getWeight());


        //  Function<T, R>
        Function<Integer, Banana> c2 = Banana::new;
        Banana lambda2 = c2.apply(5);
        System.out.println(lambda2.getWeight());
    }
}
