
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        int seconds = days * 24 * 60 * 60; //Number of days multiplied by hours, minutes in a hour and seconds in a minute
        System.out.println(seconds);

    }
}
