package designpattern.observer;

public class ObserverMain {

    public static void observerRun() {
        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());
        f.notifyObserver("The queen said her favourite book is Modern Java in Action!");
    }
}
