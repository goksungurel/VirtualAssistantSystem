import java.time.LocalTime;

public class TimeAssistant extends VirtualAssistant{
    public TimeAssistant(String assistantName,String version) {
        super(assistantName,version);
    }
    public String greetUser(){
        return "hello ı am your time assistant";
    }
    public String performTask(String task){
        if(task.equalsIgnoreCase("what time is it now")){
            LocalTime time = LocalTime.now();
            return "time is : "+time.toString();

        }
        return "I cannot help this ";
    }

}
