import java.util.Scanner;
public class guessingGame
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        String response = "";
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
        // Input "type 2" or "type 3"
        String type = input.nextLine();
        if (type == "type 3")
        {
            System.out.print("Pick a number between 1 and 100. ");
            System.out.print( "We'll guess what it is and keep score based on how many guesses it takes us");
            int number = input.nextInt();
            guess = 50;
            int points = 1;
            while (response != "correct");
            {
                response = input.nextLine();
                if (response == "higher")
                {
                    guess = 75;
                    points += 1;
                }
            }

        }
    }
}