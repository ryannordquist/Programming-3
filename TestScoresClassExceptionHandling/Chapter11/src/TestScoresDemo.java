import java.util.Scanner;

/**
 * This program gets a set of test scores and
 * uses the TestScores class to calculate the average.
 * If any of the test scores are negative or above 100,
 * a new IllegalArgumentException exception is thrown.
 */

public class TestScoresDemo 
{
	public static void main(String[] args) throws IllegalArgumentException
	{	
		try
			{
			
				// Get the test scores and create an array
				// to hold the test scores.
				double[] scores = { -5, 0, 50, 100 };
			
				// Declare a new TestScores variable, passing the
				// scores in the scores array as an argument.
				TestScores myTestScores = new TestScores(scores);
			
				// Get the test scores and store them
				// in the scores array.
				for (int index = 0; index < scores.length; index++)
				{
					System.out.println("Score #" + (index + 1) + ": " + scores[index]);					
				}
			
				// Display the average
				System.out.println("Your average is " + myTestScores.getAverage());
			}
		catch (IllegalArgumentException e)
			{
				System.out.println("Error: Invalid test score(s) detected."
						+ " Test scores must be between 0 and 100.");
			}
	}
}
