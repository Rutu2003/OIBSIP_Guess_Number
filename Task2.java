import java.util.Random;
import java.util.Scanner;
import java.util.*;
  
public class Task2
{
    public static void main(String[] args)
    {
        int ans, guess;
		final int MAX = 100;
		Scanner sc = new Scanner(System.in);
  		Random rand = new Random();
  		boolean correct = false;
		ans = rand.nextInt(MAX) + 1;
  		while (!correct) 
		{
  			System.out.println("Guess a number between 1 and 100:");
			guess = sc.nextInt();
            if (guess > ans)
			{
            	System.out.println("Entered number is too large.");
            }
  			else if (guess < ans)
			{
            	System.out.println("Entered number is too small.");
            }
			else 
			{
                System.out.println("Yes, Your number is correct.");
  				correct = true;
            }
        }
        System.exit(0);
    }
}