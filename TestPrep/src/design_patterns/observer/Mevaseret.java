package design_patterns.observer;

public class Mevaseret implements WeatherObserver {
    private String currentWeather;


    @Override
    public void updateWeather(Weather weather) {
        this.currentWeather = weather.getWeather();

    }

    public void printWeatherInMevaseret() {
        System.out.println("Current weather in Mevaseret: "+ currentWeather);
    }
}
