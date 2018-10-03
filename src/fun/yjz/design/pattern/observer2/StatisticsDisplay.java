package fun.yjz.design.pattern.observer2;

public class StatisticsDisplay implements DisplayElement, Observer {

    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float tempSum = 0.0f;
    private float addCount = 0;

    /**
     * Show the min、average and max temperature.
     */
    @Override
    public void display() {
        if (addCount != 0) {
            System.out.println("StatisticsDisplay: min, avg, max temperature = " + this.minTemp + "," + (tempSum / addCount) + "," + this.maxTemp);
        } else {
            System.out.println("illegal operation.");
        }
    }

    @Override
    public void update(Observable observable, Object object) {
        if (observable instanceof WeatherStation) {
            WeatherData data = (WeatherData) object;
            float temp = data.getTemperature();
            tempSum += temp;
            addCount++;

            if (temp > maxTemp) {
                this.maxTemp = temp;
            }

            if (temp < minTemp) {
                this.minTemp = temp;
            }

            display();
        }
    }
}
