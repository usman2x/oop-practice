package practice.design.patterns.observer;

public class WeatherStationApp {
    public static void main(String[] args) {
        WeatherStationApiImp concreteSubject = new WeatherStationApiImp();
        BBCWeatherReporting concreteObserver = new BBCWeatherReporting();
        concreteSubject.addObserver(concreteObserver);
        concreteSubject.notifyObservers();
    }
}
