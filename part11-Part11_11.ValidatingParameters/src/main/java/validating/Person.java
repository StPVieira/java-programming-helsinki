package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
    if (name == null) {
        throw new IllegalArgumentException("Name not accepted.");
    }
    if (name.isEmpty()) {
        throw new IllegalArgumentException("Name not accepted.");
    }
    if (name.length() > 40) {
        throw new IllegalArgumentException("Name should not be over 40 characters.");
    }
    
    this.name = name;
    
    if (age < 0 || age > 120) {
        throw new IllegalArgumentException("Age should be between 0 and 120.");
    }    
    this.age = age;
}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
