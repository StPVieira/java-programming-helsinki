
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNumbers = 0;
        int sumOfPositive = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0){
                break;
            }
            if(number > 0){
                positiveNumbers = positiveNumbers + 1;
                sumOfPositive = sumOfPositive + number;
            }
        }
        if(positiveNumbers == 0){
            System.out.println("Cannot calculate the average");
        }else {
            System.out.println(1.0 * sumOfPositive / positiveNumbers);
        }

    }
}
