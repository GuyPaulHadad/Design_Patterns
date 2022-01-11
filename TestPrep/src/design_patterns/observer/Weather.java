package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;
/*
This is the class that Jerusalem and Mevaseret are observing.
First we make a ArrayList that hold the observers (Mevaseret and Jerusalem).
We use an add method to add them and update there weather to the current weather.
Lastly when the weather changes we update their weather using notifyObservers.
 */

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


