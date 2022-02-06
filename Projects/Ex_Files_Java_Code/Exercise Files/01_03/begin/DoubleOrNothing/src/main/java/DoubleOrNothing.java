import java.util.Scanner;
import java.util.Random;

public class DoubleOrNothing {

    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public boolean wantsToContinue(){

        char response = scanner.next().charAt(0);
        while(!(Character.toUpperCase(response) == 'Y' || Character.toUpperCase(response) == 'N')){
            System.out.println("That input is invalid. Please enter Y or N.");
            response = scanner.next().charAt(0);
        }

        return Character.toUpperCase(response) == 'Y';
    }

    public void playGame() {

        int points = 10;
        boolean userHasPoints = true;
        boolean wantsToContinue;

        do{
            System.out.println("You have " + points + " points. Would you like to take a chance to double your points or walk away? Y/N");
            wantsToContinue = wantsToContinue();
            if(wantsToContinue){
                int toDouble = rand.nextInt(4);
                if(toDouble == 0){
                    System.out.print("You lose! ");
                    points = 0;
                    userHasPoints = false;
                }
                else{
                    System.out.print("You have doubled your points! ");
                    points = points * 2;
                }
            }

        }while(userHasPoints && wantsToContinue);

        scanner.close();

        System.out.println("You have ended the game with " + points + " points.");

    }
}