import java.util.Scanner;
public class guessingGame
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        double generated = Math.random();
        int x = (int)(generated * 11);
        System.out.print("Welcome to the guessing game.");
        System.out.print(" Guess what the answer is from 0 - 10");
        int guess = input.nextInt();
        while (guess != x)
        {
        System.out.print("Guess again");
        guess = input.nextInt();
        }
        System.out.print("You did it");

        System.out.print("Do you want to try something different");
        String playAgain = input.nextLine();
        if (playAgain.equals("no"))
        {
            System.out.print("If you change your mind, you have to run the whole thing again and play level one :)");
        }
        System.out.print("Welcome to the jungle. Please select a difficulty.");
        // Input "type 1", "type 2" "type 3" or "type 4"
        
    }
}