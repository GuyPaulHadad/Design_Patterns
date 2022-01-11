package design_patterns.observer;

/*
A class that wants to know what the weather is.
To do this it implements the weather observer interface.
 */
public class Jerusalem implements WeatherObserver {
    private String currentWeather;

    @Override
    // Method from interface which weather will use to update Jerusalem's current weather.
    public void updateWeather(Weather weather) {
        this.currentWeather = weather.getWeather();

    }

    public void printWeatherInJerusalem() {
        System.out.println("Current weather in Jerusalem: " + currentWeather);
    }
}



