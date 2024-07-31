
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int count = 0; count < number; count++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int countSpaces = 0;countSpaces < number; countSpaces++){
            System.out.print(" ");
        }
           
    }

    public static void printTriangle(int size) {
        int stars = 1;
        while(stars <= size){
            printSpaces(size - stars);
            printStars(stars);
            stars++;
        }
    }

    public static void christmasTree(int height) {
        int stars = 1;
        while(stars <= height){
            printSpaces(height - stars);
            printStars(stars + (stars - 1));
            stars++;
        }
        for(int countBase = 0; countBase < 2; countBase++){
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        printSpaces(1);
        
        System.out.println("");

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
