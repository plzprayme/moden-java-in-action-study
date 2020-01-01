package stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeMain {

    public static void practiceRun() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

//        numberOne(transactions);
//        numberTwo(transactions);
//        numberThree(transactions);
//        numberFour(transactions);
//        numberFive(transactions);
//        numberSix(transactions);
//        numberSeven(transactions);
        numberEight(transactions);
    }



    private static void numberOne(List<Transaction> transactions) {
        List<Transaction> tmp = transactions.stream().filter(x -> x.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        System.out.println(tmp);
    }

    private static void numberTwo(List<Transaction> transactions) {
        List<String> a = transactions.stream().map(i -> i.getTrader().getCity()).collect(Collectors.toList());
    }

    private static void numberThree(List<Transaction> transactions) {
        System.out.println(
                transactions.stream()
                            .filter(i -> i.getTrader().getCity().equals("Cambridge"))
                            .distinct().sorted(Comparator.comparing(i -> i.getTrader().getName()))
                            .collect(Collectors.toList())
        );
    }

    private static void numberFour(List<Transaction> transactions) {
        System.out.println(
                transactions.stream()
                            .map(i -> i.getTrader().getName()).distinct()
                            .collect(Collectors.joining(","))
        );
    }

    private static void numberFive(List<Transaction> transactions) {
        System.out.println(
                transactions.stream()
                            .anyMatch(i -> i.getTrader()
                                            .getCity()
                                            .equals("Milan")
                            )
        );
    }

    private static void numberSix(List<Transaction> transactions) {
        transactions.stream()
                .filter(i -> i.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
    }

    private static void numberSeven(List<Transaction> transactions) {
        System.out.println(
                transactions.stream()
                            .map(Transaction::getValue)
                            .reduce(Integer::max)
        );
    }

    private static void numberEight(List<Transaction> transactions) {
        System.out.println(
                transactions.stream()
                            .min(Comparator.comparing(Transaction::getValue))
        );
    }
}
