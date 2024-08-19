
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(person -> this.employees.add(person));
    }
    
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            Person currentEmployee = iterator.next();
            if(currentEmployee.getEducation() == education){
                System.out.println(currentEmployee);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.employees.iterator();
        while(iterator.hasNext()){
            Person currentEmployee = iterator.next();
            if(currentEmployee.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
