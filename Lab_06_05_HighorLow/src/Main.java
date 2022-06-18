import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userGuess = 0;
        String trash = "";
        boolean notInteger = true;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Pick a number 1-10: ");

            if (in.hasNextInt())
            {
                userGuess = in.nextInt();
                in.nextLine();

                // test if input is negative

                if (userGuess >= 1)
                {
                    if (userGuess <= 10)
                    {
                        notInteger = false;
                    }
                    else
                    {
                        System.out.println("Pick a number 1-10");
                        notInteger = true;
                    }
                }
                else
                {
                    System.out.println("Pick a number 1-10");
                    notInteger = true;
                }
            }
            // test is input is not int
            else
            {
                trash = in.nextLine();
                System.out.println("Please input an integer: " + trash);
                notInteger = true;
            }
        }
        while (notInteger);

        Random rn = new Random();

        int randomNum = rn.nextInt(10) + 1;

        if (randomNum == userGuess)
        {
            System.out.println("You guessed the correct number!");
            System.out.println("Your guess: " + userGuess);
            System.out.println("Winning number: " + randomNum);
        }
        else if (randomNum > userGuess)
        {
            System.out.println("Your guess was lower than the winning number.");
            System.out.println("Your guess: " + userGuess);
            System.out.println("Winning number: " + randomNum);
        }
        else
        {
            System.out.println("Your guess was greater than the winning number.");
            System.out.println("Your guess: " + userGuess);
            System.out.println("Winning number: " + randomNum);
        }

    }
}