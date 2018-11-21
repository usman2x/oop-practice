package practice.design.patterns.observer;

public interface WeatherStationApi {
    void addObserver(WeatherObserver weatherObserver);

    void removeObserver(WeatherObserver weatherObserver);

    void notifyObservers();
}