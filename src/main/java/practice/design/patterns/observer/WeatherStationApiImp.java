package practice.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationApiImp implements WeatherStationApi {
    private List<WeatherObserver> weatherObserverList = new ArrayList<>();

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weatherObserverList.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        if (weatherObserverList.indexOf(weatherObserver) >= 0) {
            weatherObserverList.remove(weatherObserver);
        }
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver weatherObserver : weatherObserverList) {
            weatherObserver.update(45.0f, 40.0f, 47.0f);
        }
    }
}
