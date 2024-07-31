public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this(name, 0, 0, 0);
    }
    
    public Person(String name, int age, int weight, int height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
        this.growOlder(1);
    }
    
    public void growOlder(int years){
        this.age += years;
    }

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
}