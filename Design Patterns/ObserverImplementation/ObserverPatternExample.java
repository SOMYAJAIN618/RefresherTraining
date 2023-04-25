package ObserverImplementation;
import java.util.ArrayList;
import java.util.List;


interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

interface Observer {
    void update(int data);
}


class ConcreteSubject implements Subject {
    private List<Observer> observers;
    private int data;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(data);
        }
    }

    public void setData(int data) {
        this.data = data;
        notifyObservers();
    }
}


class ConcreteObserver implements Observer {
    private int data;

    @Override
    public void update(int data) {
        this.data = data;
        System.out.println("Received new data: " + data);
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver();
        subject.registerObserver(observer1);

        ConcreteObserver observer2 = new ConcreteObserver();
        subject.registerObserver(observer2);

        subject.setData(1);
        subject.setData(2);

        subject.removeObserver(observer1);

        subject.setData(3);
    }
}