import java.util.Scanner;

public class UserInterface{
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            processCommand(command);
        }
        
    }
    
    public void processCommand(String command){
        if(command.equals("add")){
            adder();
        }else if(command.equals("list")){
            lister();
        }else if(command.equals("remove")){
            System.out.println("Which one is removed? ");
            int removed = Integer.valueOf(scanner.nextLine());
            remover(removed);
        }
    }
    
    public void adder(){
        System.out.println("To add: ");
        String toAdd = scanner.nextLine();
        list.add(toAdd);
    }
        
    public void lister(){
        list.print();
    }
    
    public void remover(int removed){
        list.remove(removed);
    }
}
