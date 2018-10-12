import java.util.Scanner;
public class objective2
{
    public static void main (String [] args)
    {
       System.out.print("input type.");
        Scanner input = new Scanner (System.in);
        String response = "";
        int guess = 0;

            System.out.print("Pick a number between 1 and 100. ");
            System.out.print( "We'll guess what it is and keep score based on how many guesses it takes us");
            int number = input.nextInt();
            int min = 1;
            int max = 100;
            guess = ((int)(min + max)/2);
            System.out.print(guess);
            System.out.print("higher, lower, or correct");
            response = input.nextLine();
            int points = 1;
            while (!response.equals("correct"))
            {
                if (response.equals("higher"))
                {
                    min = guess;
                    guess = (int)(min + max)/2;
                   System.out.print(guess);
                    response = input.nextLine();
                    points +=1;
                }
                else if (response.equals("lower"))
                {
                    max = guess;
                    guess = (int) (min + max)/2;
                    System.out.println(guess);
                    response = input.nextLine();
                    points += 1;
                }
                System.out.print("You're score is ");
                System.out.print(points);

            }
            System.out.print("why");
        }
    }

