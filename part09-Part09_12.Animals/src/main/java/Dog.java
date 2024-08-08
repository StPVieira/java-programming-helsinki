
public class Dog extends Animal implements NoiseCapable {
    private String dogName;
    
    public Dog(String name){
        super(name);
        this.dogName = name;
    }
    
    public Dog(){
        this("Dog");
    }
    
    public void bark(){
        System.out.println(dogName + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }
    
}
