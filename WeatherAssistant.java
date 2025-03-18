public class WeatherAssistant extends VirtualAssistant{
    private String weatherForecast;
    public WeatherAssistant(String assistantName, String version) {
        super(assistantName,version);
        this.weatherForecast = "Sunny, with a slight chance of clouds.";
    }
    public String greetUser() {
        return "Welcome I am your Weather Assistant!";

    }
    public String performTask(String task) {
        if(task.equalsIgnoreCase("what is the weather today?")){
            return "Today's weather is sunny and 25°C.";
        }else if(task.equalsIgnoreCase("is it going to rain today?")){
            return "It is raining today.";
        }
        return "Sorry ı cannot help with that.";
    }
    public String getWeatherForecast(){
        return "Weather Forecast: "+this.weatherForecast;
    }

    public void updateWeatherForecast(String newForecast){
        this.weatherForecast = newForecast;
        System.out.println("Weather Forecast updated to: "+ newForecast);
    }
}
