package design_patterns.observer;

public class MainObserver {
    //creating and using the observers
    public static void main(String[] args) {
        Weather weather = new Weather("Hot and Humid");
        Jerusalem jerusalem = new Jerusalem();
        Mevaseret mevaseret = new Mevaseret();
        weather.addObserver(jerusalem);
        weather.addObserver(mevaseret);
        jerusalem.printWeatherInJerusalem();
        mevaseret.printWeatherInMevaseret();

        weather.setWeather("Cold and Dry");

        jerusalem.printWeatherInJerusalem();
        mevaseret.printWeatherInMevaseret();

    }

}
