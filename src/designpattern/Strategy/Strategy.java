package designpattern.Strategy;

import javax.xml.validation.Validator;

public class Strategy {
    private final ValidationStrategy strategy;

    public static void strategyRun() {
        Strategy numericValidator = new Strategy(new IsNumeric());
        boolean b1 = numericValidator.validate("aaa");
        Strategy lowerCaseValidator = new Strategy(new IsAllLowerCase());
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
