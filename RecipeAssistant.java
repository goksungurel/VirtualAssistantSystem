public class RecipeAssistant extends VirtualAssistant{
    public RecipeAssistant(String assistantName,String version){
        super(assistantName, version);
    }
    public String greetUser(){
        return "Hello I am your Recipe Assistant";

    }
    public String performTask(String task) {
        if (task.equalsIgnoreCase("give me a pasta recipe")) {
            return "To make a pasta,use 1 pack of pasta, 2 tablespoons of olive oil,and salt.";
        } else if (task.equalsIgnoreCase("give me a cauliflower recipe")) {
            return "To make cauliflower, use 1 cauliflower, 1 onion, and spices.";
        }
        return "Sorry ,I don't know that recipe!";
    }

    }
