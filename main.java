import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AssistantManager manager=new AssistantManager();

        VirtualAssistant weatherAssistant =new WeatherAssistant("Weather Assistant", "v1.0");
        VirtualAssistant timeAssistnt =new TimeAssistant("Time Assistant", "v1.0");
        VirtualAssistant recipeAssistant =new RecipeAssistant("Recipe Assistant", "v1.0");

        List<VirtualAssistant> assistants=new ArrayList<>();
        assistants.add(weatherAssistant);
        assistants.add(timeAssistnt);
        assistants.add(recipeAssistant);


        interactWithAll(assistants, "what is the weather today?");
        interactWithAll(assistants, "what is the current time?");
        interactWithAll(assistants, "give me a pasta recipe");


        ((WeatherAssistant) weatherAssistant).updateWeatherForecast("Rainy, with thunderstorms in the evening.");
        interactWithAll(assistants, "what is the weather today?");
    }


    public static void interactWithAll(List<VirtualAssistant> assistants, String task) {
        for (VirtualAssistant assistant : assistants) {
            System.out.println(assistant.greetUser());
            System.out.println(assistant.performTask(task));

            if (assistant instanceof WeatherAssistant) {
                System.out.println(((WeatherAssistant) assistant).getWeatherForecast());
            }
        }

    }
}
