package designpattern.strategy;

public class Strategy {
    private final ValidationStrategy strategy;

    public static void strategyRun() {
//        Strategy numericValidator = new Strategy(new IsNumeric());
        Strategy numericValidator =
                new Strategy((String s) -> s.matches("\\d+"));
        boolean b1 = numericValidator.validate("aaa");
//        Strategy lowerCaseValidator = new Strategy(new IsAllLowerCase());
        Strategy lowerCaseValidator =
                new Strategy((String s) -> s.matches("[a-z]+"));
        boolean b2 = lowerCaseValidator.validate(("bbbb"));

        System.out.println(b1 + " / " + b2);

    }

    public Strategy(ValidationStrategy v) {
        this.strategy = v;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }


}
