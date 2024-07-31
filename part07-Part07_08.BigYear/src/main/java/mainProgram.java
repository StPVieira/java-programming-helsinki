
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BirdDatabase birds = new BirdDatabase();
        
        while(true){
            System.out.println("?");
            String command = scan.nextLine();
            if(command.equals("Quit")){
                break;
            }
            if(command.equals("Add")){
                System.out.println("Name: ");
                String birdName = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird(birdName, latinName);
                birds.add(bird);
            }
            if(command.equals("Observation")){
                System.out.println("Bird?");
                String birdObserved = scan.nextLine();
                boolean wasSuccessfull = birds.observation(birdObserved);
                if (!wasSuccessfull) {
                    System.out.println(birdObserved + " is not a bird!");
                } 
            }
            if(command.equals("All")){
                for(Bird bird : birds.all()){
                    System.out.println(bird);
                }
            }
            if(command.equals("One")){
                System.out.println("Bird? ");
                String chosenBird = scan.nextLine();
                for(Bird bird : birds.all()){
                    if(bird.getName().equals(chosenBird)){
                        System.out.println(bird);
                    }
                }
            }
        }
    }
}
