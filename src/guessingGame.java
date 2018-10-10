import java.util.Scanner;
public class guessingGame
{
    public static void guessingGame(String num)
    {
        int number = 0;
        String diff = "";
        Scanner input = new Scanner(System.in);
        System.out.print("type 1,2,3, or 4"); // please type: type num
        diff = input.nextLine(); // please type: type
        if (diff.equals("type 1"))
        {
            System.out.print("pick a number from 0 - 100");
            number = input.nextInt();
            while (number != (int guess))
            {

            }
        }
    }
}
