import java.util.List;
import java.util.ArrayList;
public class AssistantManager {
    private List<VirtualAssistant> assistants;
    public AssistantManager(){
        this.assistants = new ArrayList<>();
    }
    public void addAssistant(VirtualAssistant assistant){
        assistants.add(assistant);
        System.out.println(assistant.getAssistantName()+"added.");
    }
    public void removeAssistant(VirtualAssistant assistant){
        assistants.remove(assistant);
        System.out.println(assistant.getAssistantName()+"removed.");

    }
    public void interactWithAll(String task){
        for(VirtualAssistant assistant : assistants){
            System.out.println(assistant.greetUser());
            System.out.println(assistant.performTask(task));
        }
    }

}
