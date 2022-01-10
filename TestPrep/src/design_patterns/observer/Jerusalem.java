package design_patterns.observer;

public class Jerusalem implements WeatherObserver{
    private String currentWeather;

    @Override
    public void updateWeather(Weather weather) {
        this.currentWeather = weather.getWeather();

    }
    public void printWeatherInJerusalem(){
        System.out.println("Current weather in Jerusalem: "+ currentWeather);
    }
}



