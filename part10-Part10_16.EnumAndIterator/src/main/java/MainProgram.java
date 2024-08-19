
public class MainProgram {

    public static void main(String[] args) {
        Employees t = new Employees(); 
        Person h = new Person("Arto", Education.PHD); 
        Person a = new Person("Pedro", Education.HS);
        t.add(h); 
        t.add(a);
        t.fire(Education.PHD); 
        t.print();
    }
}
