
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        System.out.println("Enter points totals, -1 stops: ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            if (input < 0 || input > 100) {
                continue;
            }
            this.register.addGradeBasedOnPoints(input);
        }
    }

    public void printGradeDistribution() {
        System.out.println("Point average (all): " + register.averageOfPoints());
        System.out.println("Point average (passing): " + register.averagePassingPoints());
        System.out.println("Pass percentage: " + register.passPercentage());
        System.out.println("Grade distribution: ");
        int grade = 5;
        
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        } 
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}

