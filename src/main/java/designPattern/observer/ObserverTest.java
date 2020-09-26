package designPattern.observer;

public class ObserverTest {

    public static void main(String[] args) {

        UserObserver dawidObserver = new UserObserver("Dawid");
        UserObserver tomekObserver = new UserObserver("Tomek");
        UserObserver kasiaObserver = new UserObserver("Kasia");

        YtChannel ytChannel = new YtChannel();
        ytChannel.register(dawidObserver);
        ytChannel.notifyObservers();
        System.out.println("-----------------");

        ytChannel.register(tomekObserver);
        ytChannel.register(kasiaObserver);
        ytChannel.notifyObservers();
        System.out.println("-----------------");

        ytChannel.unregister(kasiaObserver);
        ytChannel.notifyObservers();
        System.out.println("-----------------");
    }

}
