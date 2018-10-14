import java.util.Scanner;
public class objective2<points> {
    public static void main(String[] args) {
        System.out.print("input type.");
        Scanner output = new Scanner(System.in);
        String response = "";
        response = output.nextLine();
        if (response.equals("type3"))
        {
            System.out.print("Pick a number between 1 and 100. ");
            System.out.print("We'll guess what it is and keep score based on how many guesses it takes us");
            int number = output.nextInt();
            int min = 1;
            int max = 100;
            int guess = ((min + max) / 2);
            System.out.print(guess);
            System.out.print(" higher, lower, or correct");
            int points = 1;
            while (number != guess) {
                response = output.nextLine();
                if (response.equals("higher")) {
                    min = guess;
                    guess = ((min + max) / 2);
                    System.out.print(guess);
                    points += 1;
                } else if (response.equals("lower")) {
                    max = guess;
                    guess = ((min + max) / 2);
                    points += 1;
                    System.out.print(guess);
                }
            }
            System.out.print(" You got a score of ");
            System.out.print(points);
        }
        else
            {
                System.out.print("Pick a number between 1 and 10. ");
                System.out.print("We'll guess what it is and keep score based on how many guesses it takes us");
                int number = output.nextInt();
                int min = 1;
                int max = 10;
                int guess = ((min + max) / 2);
                System.out.print(guess);
                System.out.print(" higher, lower, or correct");
                int points = 1;
                while (number != guess) {
                    response = output.nextLine();
                    if (response.equals("higher")) {
                        min = guess;
                        guess = ((min + max) / 2);
                        System.out.print(guess);
                        points += 1;
                    } else if (response.equals("lower")) {
                        max = guess;
                        guess = ((min + max) / 2);
                        points += 1;
                        System.out.print(guess);
                    }
                }
                System.out.print(" You got a score of ");
                System.out.print(points);
            }
            }
}