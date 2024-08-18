/**
 * WEATHER NETWORK
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that prints a specific message depending
 *    on what the temperature is.
 * 
 * @packages
 *    None
 */

public class WeatherNetwork {
    public static void main(String[] args) {
        int temp = 25;  
        String forecast = "";     
        
        if (temp <= -1) {
            forecast = "The forecast is FREEZING! Stay home!";
        } else if (temp <= 10) {
            forecast = "The forecast is Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. Go outside!";
        }

        System.out.println(forecast);
    }
}
