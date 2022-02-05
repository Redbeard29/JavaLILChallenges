import java.util.Scanner;

public class EvenOrOdd {

   public static boolean isEven(int num) {
       return num % 2 == 0;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a number: ");
       int userNum = scanner.nextInt();
       System.out.println("Is the number even? " + isEven(userNum));
   }
}
