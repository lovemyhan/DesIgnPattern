package fun.yjz.design.pattern.observer;

import java.util.Observable;

public class MyObserver extends Observable {

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}
