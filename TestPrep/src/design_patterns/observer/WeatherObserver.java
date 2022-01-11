package design_patterns.observer;

/*
An interface implemented by places\people who want to know what the weather is in their location.
AKA, weather observers.
 */
public interface WeatherObserver {
    void updateWeather(Weather weather);
}
