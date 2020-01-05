import action.ActionMain;
import designpattern.chain.HeaderTextProcessing;
import designpattern.chain.ProcessingObject;
import designpattern.chain.SpellCheckerProcessing;
import designpattern.observer.Observer;
import designpattern.observer.ObserverMain;
import designpattern.strategy.Strategy;
import lambda.LambdaMain;
import stream.StreamMain;

public class Main {

    public static void main(String[] args) {

//        runAction();

//        runLambda();

//        runStreamMain();

//        Strategy.strategyRun();
//        ObserverMain.observerRun();

        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();
        p1.setSuccessor(p2);
        String result = p1.handle("Aren't labdas really sexy?!!");
        System.out.println(result);

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
