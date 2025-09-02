import java.util.Scanner;
import java.util.Random;
public class numGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1,101);
        int guess;
        int attempts =0;
        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess > randomNumber){
                System.out.println("TOO HIGH! TRY AGAIN");
            }
            else if(guess < randomNumber){
                System.out.println("TOO LOW! try again");
            }
            else{
                System.out.println("Correct! The number was "+ randomNumber);
                System.out.printf("You took %d attempts to win",attempts);
            }


        }while(guess!=randomNumber);

    }
}

