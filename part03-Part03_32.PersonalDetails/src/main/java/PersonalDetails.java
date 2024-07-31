
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggerNameSize = 0;
        int sum = 0;
        int count = 0;
        String biggerName = "";
        while(true){
            String personalDetails = scanner.nextLine();
            
            if(personalDetails.equals("")){
                break;
            }
            String[] list = personalDetails.split(",");
            int nameSize = list[0].length();
            int year = Integer.valueOf(list[1]);
            
            if(nameSize > biggerNameSize){
                biggerNameSize = nameSize;
                biggerName = list[0];
            }
            sum += year;
            count++;
        }
        System.out.println("Longest name: " + biggerName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
    }
}
