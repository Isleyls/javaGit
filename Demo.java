import java.util.Scanner;
import java.util.*;
public class Demo 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		
		Lottery g;
		try
		{
			System.out.println("Welcome to the Lottery! Choose a number between 1-30. "
					+ "Winning number is randomized");
			int winningNum = rand.nextInt(30)+1;
			int guess = kb.nextInt();
		if(guess==winningNum)
		{
			g = new Winner();
			g.results();
		}
		else
		{
			g = new Loser();
			g.results();
		}
		
		}
		catch(InputMismatchException e)
		{
			kb.nextLine();
			System.out.println("You typed in an invalid response, please type in an Integer between"
					+ " 1-20");
			int guess = kb.nextInt();
		
		}
		
		
	}
}
