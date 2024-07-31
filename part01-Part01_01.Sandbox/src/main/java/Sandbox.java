public class Sandbox {
    
    public static void main(String[] args) {
        
        Person pedro = new Person("Pedro");
        Person raquel = new Person("Raquel");
        System.out.println(pedro);
        
        pedro.growOlder();
        System.out.println(pedro);
        pedro.growOlder(15);
        System.out.println(pedro);
    }

}
        
