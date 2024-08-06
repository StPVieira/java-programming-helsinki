
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 de seu januario");
        Person esko = new Person("Só esko mesmo", "35 de abobrinha");
        Student adaTwo = new Student("Ada Lovelace", "24 de seu januario");
        System.out.println(ada);
        System.out.println(esko);
        System.out.println(adaTwo);
    }
    
    public static void printPersons(ArrayList<Person> persons){
        for(Person person : persons){
            System.out.println(person);
        }
    }

}
