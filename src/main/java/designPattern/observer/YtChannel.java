package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class YtChannel implements ActionsObserver {

    private List<Observer> observers;

    public YtChannel() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
