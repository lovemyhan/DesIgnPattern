package fun.yjz.design.pattern.observer2;

public class Test {
    public static void main(String[] args) {
        WeatherStation bd = new WeatherStation();
        // Register two bulletin boards to the weather station.
        bd.addObserver(new CurrentConditionsDisplay());
        bd.addObserver(new StatisticsDisplay());

        // If data has changed, set flag changed when you want the two bulletin boards know.
        bd.setChanged();
        bd.notifyObservers(new WeatherData(200f, 100f, 100f));
        bd.setChanged();
        bd.notifyObservers(new WeatherData(150f, 100f, 100f));
        bd.setChanged();
        bd.notifyObservers(new WeatherData(100f, 100f, 100f));
    }
}
