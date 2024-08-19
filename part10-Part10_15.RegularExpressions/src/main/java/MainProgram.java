
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        Checker checker = new Checker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the time and I'll check if it's the correct format!");
        while(true){
            String string = scanner.nextLine();
            if(string.isEmpty()){
                break;
            }
            if(checker.timeOfDay(string)){
                System.out.println("Yes! XD");
            }else{
                System.out.println("No! ;-;");
            }
        }
        
    }
}
