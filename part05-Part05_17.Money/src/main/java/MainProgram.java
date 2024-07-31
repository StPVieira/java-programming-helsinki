
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        System.out.println(a.euros() + "   " + a.cents());
        Money b = new Money(3, 50);
        System.out.println(b.euros() + "   " +  b.cents());

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);       

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.50e
        System.out.println(c);  // 0.00e
    }
}