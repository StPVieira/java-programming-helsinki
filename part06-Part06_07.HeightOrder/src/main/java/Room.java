import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){
        return persons.size() == 0;
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if(persons.size() == 0){
            return null;
        }
        
        Person shortest = persons.get(0);
        
        for(Person person : persons){
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take(){
        Person shortestPerson = shortest();
        persons.remove(shortestPerson);
        return shortestPerson;
        }
    }

