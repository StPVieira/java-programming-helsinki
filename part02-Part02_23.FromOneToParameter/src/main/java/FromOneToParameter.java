

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int number){
        for(int count = 1; count <= number; count++){
            System.out.println(count);
        }  
    }

}
