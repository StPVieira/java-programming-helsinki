
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int factorial = 1;
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        for(int count = 1; count <= number; count++){
            factorial *= count;
        }
        System.out.println("Factorial: " + factorial);

    }
}
