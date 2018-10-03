package fun.yjz.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class NoteBook implements Observer {
    @Override
    public void update(Observable observable, Object object) {
        if (observable.getClass() == MyObserver.class) {
            System.out.println("收到，" + object.toString());
        }
    }
}
