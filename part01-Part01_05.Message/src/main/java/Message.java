
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        // Write your program here
        
        //Lê a string digitada pelo usuário e aloca à memória
        //String message = "Write a message: (digitado pelo usuário)"
        String message = scanner.nextLine();
        
        //Imprime a mensagem do usuário
        System.out.println(message);

    }
}
