public class Cat extends Animal implements NoiseCapable {
    private String catName;
    
    public Cat(String name){
        super(name);
        this.catName = name;
    }
    
    public Cat(){
        this("Cat");
    }
    
    public void purr(){
        System.out.println(catName + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
    
}