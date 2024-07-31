
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbersNumber = 0;
        
        while(true){
            System.out.println("Give a number:");
            int numbers = Integer.valueOf(scanner.nextLine());
            
            if(numbers > 0 | numbers < 0){
                numbersNumber = numbersNumber + 1;
            }
            if(numbers == 0){
                break;
            }
        }
        System.out.println("Number of numbers: " + numbersNumber);

    }
}
