import action.ActionMain;
import designpattern.Strategy.Strategy;
import lambda.LambdaMain;
import stream.StreamMain;

public class Main {

    public static void main(String[] args) {

//        runAction();

//        runLambda();

//        runStreamMain();
        Strategy.strategyRun();
    }


    private static void runAction() {
        ActionMain actionMain = new ActionMain();
        actionMain.run();
    }

    private static void runLambda() {
        LambdaMain lambdaMain = new LambdaMain();
        lambdaMain.run();
    }

    private static void runStreamMain() {
        StreamMain streamMain = new StreamMain();
        streamMain.run();
    }
}
