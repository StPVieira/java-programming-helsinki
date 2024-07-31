
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOldest = 0;
        String oldest = " ";
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            String[] lines = input.split(",");
            Integer age = Integer.valueOf(lines[1]);
            if(age > ageOldest){
                ageOldest = age;
                oldest = lines[0];
            }
        }
        System.out.println("Name of the oldest: " + oldest);


    }
}
