package fun.yjz.design.pattern.observer2;

public interface Observable {

    void setChanged();

    boolean addObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObservers(Object data);
}
