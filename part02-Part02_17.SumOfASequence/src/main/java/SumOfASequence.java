
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        System.out.println("Last number? ");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        for(int count = 0; count <= lastNumber; count++){
            sum += count;
        }
        System.out.println("The sum is " + sum);

    }
}
