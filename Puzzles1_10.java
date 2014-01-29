import java.util.Scanner;

public class Puzzles1_10
{
	public static void main(String args[])
	{
		puzzle1();
	}

	public static void puzzle1()
	{
		System.out.println("Puzzle1 checks if the given number is odd or not");
		System.out.println("Enter your number:");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();

		if ( (i & 1) == 1)
			System.out.println("Given number is odd");
		else	
			System.out.println("Given number is even");
		
	}
}
