import java.util.Random;
import java.util.*;

public class Guess_NumberGame 
{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Random ob1 = new Random();
		int min_Range = 1;
        int max_Range = 100;
        int max_Attempts = 10;
        int score = 0;
		System.out.println("WELCOME TO GUESS THE NUMBER GAME!!!!!!!");
		do 
		{
            int secret_num = ob1.nextInt(max_Range - min_Range + 1) + min_Range;
            int attempts = 0;
            boolean guessed_corr = false;

            System.out.println("\nI have selected a number between " + min_Range + " and " + max_Range + ". Try to guess it!");

            while (attempts < max_Attempts && !guessed_corr) 
			{
                System.out.print("Enter your guess: ");
                int guess = ob.nextInt();
                attempts++;

                if (guess == secret_num) 
				{
                    System.out.println("CONGRATULATIONS!!!! You guessed the correct number in " + attempts + " attempts.");
                    guessed_corr= true;
                    score += max_Attempts - attempts + 1;
                }
				else if (guess < secret_num) 
				{
                    System.out.println("TOO LOW!! TRY AGAIN!");
                } 
				else 
				{
                    System.out.println("TOO HIGH!! TRY AGAIN!");
                }
            }

            if (!guessed_corr) 
			{
                System.out.println("SORRY!!!,You've run out of attempts. The correct number was: " + secret_num);
            }

            System.out.print("Do you want to play again?(yes/no): ");
        }
		while (ob.next().equalsIgnoreCase("yes"));
		System.out.println("THANKS FOR PLAYING! Your total score is: " + score);
        ob.close();
    }
}
