
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number < 0){
                break;
            }
            inputs.add(number);
        }    
        inputs.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(numbers -> System.out.println(numbers));
    }
}
