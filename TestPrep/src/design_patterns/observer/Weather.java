package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private String weather;
    private final List<WeatherObserver> observerList = new ArrayList<>();
    public Weather(String weather){
        this.weather = weather;
    }
    public void addObserver(WeatherObserver observer){
        observerList.add(observer);
        observer.updateWeather(this);
    }
    public void removeObserver(WeatherObserver observer){
        observerList.remove(observer);
    }
    public String getWeather() {
        return weather;
    }
    public void setWeather(String updatedWeather){
        this.weather = updatedWeather;
        notifyObservers();
    }
    private void notifyObservers(){
        for(WeatherObserver weatherObserver : observerList){
            weatherObserver.updateWeather(this);
        }

    }
}


