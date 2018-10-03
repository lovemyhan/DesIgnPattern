package fun.yjz.design.pattern.observer2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private List<Observer> observerList;
    private boolean isChanged = false;

    public WeatherStation() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void setChanged() {
        isChanged = true;
    }

    @Override
    public boolean addObserver(Observer observer) {
        return observerList.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return observerList.remove(observer);
    }

    @Override
    public void notifyObservers(Object data) {
        if (isChanged) {
            for (Object item : observerList) {
                Observer observer = (Observer) item;
                observer.update(this, data);
            }

            this.isChanged = false;
        }
    }
}
