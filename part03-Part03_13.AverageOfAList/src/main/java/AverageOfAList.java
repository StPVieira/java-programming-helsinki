
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            numbers.add(number);
        }
        int sum = 0;
        for(int inputs: numbers){
            sum += inputs;
        }
        System.out.println("Average: " + (1.0 * sum / numbers.size()));
    }
}
