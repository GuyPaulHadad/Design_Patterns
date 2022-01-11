package design_patterns.observer;

/*
A class that wants to know what the weather is.
To do this it implements the weather observer interface.
 */
public class Mevaseret implements WeatherObserver {
    private String currentWeather;


    @Override
    // Method from interface which weather will use to update Mevaseret's current weather.
    public void updateWeather(Weather weather) {
        this.currentWeather = weather.getWeather();

    }

    public void printWeatherInMevaseret() {
        System.out.println("Current weather in Mevaseret: " + currentWeather);
    }
}
