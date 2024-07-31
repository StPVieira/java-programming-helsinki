
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 9999){
                break;
            }
            list.add(number);
        }
        System.out.println("");
        int smallest = list.get(0);
        int i = 0;
        while(i < list.size()){
            
            if(list.get(i) < smallest){
                smallest = list.get(i);
            }
            i++;
        }
        System.out.println("Smallest number: " + smallest);
        
        for(int index = 0; index < list.size(); index++){
            if(list.get(index) == smallest){
                System.out.println("Found at index: " + index);
            }
        }
            
    }
}
