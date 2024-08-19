
package validating;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a name: ");
        String name = scanner.nextLine();
        System.out.println("Give an age: ");
        int age = Integer.valueOf(scanner.nextLine());
        Person test = new Person(name, age);
    }
    
}
