package fun.yjz.design.pattern.observer;

public class Test {

    public static void main(String[] args) {
        MyObserver myObserver = new MyObserver();
        myObserver.addObserver(new Book());
        myObserver.addObserver(new NoteBook());
        myObserver.setChanged();
        myObserver.notifyObservers("第一页签名改为 XXX");
    }
}
