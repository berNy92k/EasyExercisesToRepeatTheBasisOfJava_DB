package designPattern.observer;

public interface ActionsObserver {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
}
