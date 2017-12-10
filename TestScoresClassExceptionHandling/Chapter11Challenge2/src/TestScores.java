public class TestScores 
{
	private double[] test_Scores;	// The test scores
	
	/**
	 * Constructor
	 * @param scoresArray[] An array of test scores.
	 */
	
	public TestScores(double[] scoresArray)
	{
		// Assign the array argument to
		// the test_Scores field.
		test_Scores = scoresArray;
	}
	
	public double getAverage() throws InvalidTestScore 
	{
		double total = 0;		// Total of test scores.
		double average = 0;			// To hold the average
			
				// Check if there's an invalid test score
				// and throw a new IllegalArgumentException
				// exception if so.
				for (int i = 0; i < test_Scores.length; i++)
				{	
					if (test_Scores[i] < 0 || test_Scores[i] > 100)
						{
							throw new InvalidTestScore();
						}	
				}
				
				// Accumulate the total of the scores.
				for (int j = 0; j < test_Scores.length; j++)
				{
					total += test_Scores[j];
				}				
				
				// Calculate the average
				average = total / test_Scores.length;
				
		return average;
	}
}
