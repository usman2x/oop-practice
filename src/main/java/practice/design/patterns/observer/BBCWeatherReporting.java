package practice.design.patterns.observer;

public class BBCWeatherReporting implements WeatherObserver {
    private float temperature;
    private float pressure;
    private float humidity;
    private WeatherStationApi subject;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
