package fun.yjz.design.pattern.observer2;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    WeatherData data;

    public CurrentConditionsDisplay() {
        data = new WeatherData();
    }

    @Override
    public void update(Observable observable, Object object) {
        if (observable instanceof WeatherStation) {

            if (object instanceof WeatherData) {
                data = (WeatherData) object;
                display();
            }
        }
    }

    /**
     * Show the current conditions weather data.
     */
    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay: " + data.toString());
    }
}
