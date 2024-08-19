
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        System.out.println("Input numbers, type end to stop.");
        
        while (true){
            String number = scanner.nextLine();
            if(number.equals("end")){
                break;
            }
            
            inputs.add(Integer.valueOf(number));
        }    
        System.out.println("Print the average of the negative numbers or the positive numbers?(n/p)");
        String choice = scanner.nextLine();
        if(choice.equals("n")){
            System.out.println("Average of the negative numbers: " + inputs.stream().mapToInt(i -> i).filter(n -> n < 0).average().getAsDouble());
        }else if(choice.equals("p")){
            System.out.println("Average of the positive numbers: " + inputs.stream().mapToInt(i -> i).filter(p -> p > 0).average().getAsDouble());
        }
    }
}
