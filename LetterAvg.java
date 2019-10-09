
public class LetterAvg extends MesoInherit
{
	private char key;
	protected static String stId = getStID();
	
	public LetterAvg(char c) 
	{
		super(stId);
		this.key = c;
	}

	public LetterAvg(String stID) 
	{
		super(stID);
	}



	public char letterAverage()
	{
		//char.getNumericValue(char c);
		String stID = getStID();
		int ceil = 0;
		int floor = 0;
		int round = 0;
		double sum = 0.0;
		char c = ' ';
		
		for(int i = 0; i < 4; ++i)
		{
			c = stID.charAt(i);
			sum += (int)c;
			
		}
		
		//actually take the average
		sum = sum / 4;
		
		ceil = (int)Math.ceil(sum);
//		System.out.println("Ascii Ceiling is " + ceil);
		floor = (int)Math.floor(sum);
//		System.out.println("Ascii Floor is " + floor);
		round = (int)Math.round(sum);
//		System.out.println("Ascii Average is " + round);
		char out = (char)sum;
		
		return out;
		
	}
	
	public int[] calAverage()
	{
		//char.getNumericValue(char c);
		String stID = getStID();
		int ceil = 0;
		int floor = 0;
		int round = 0;
		double sum = 0.0;
		char c = ' ';
		
		for(int i = 0; i < 4; ++i)
		{
			c = stID.charAt(i);
			sum +=  (int)c;
			
		}
		
		sum = sum / 4;
		
		ceil = (int)Math.ceil(sum);
//		System.out.println("Ascii Ceiling is " + ceil);
		floor = (int)Math.floor(sum);
//		System.out.println("Ascii Floor is " + floor);
		round = (int)Math.round(sum);
//		System.out.println("Ascii Average is " + round);
		
		//fill the array to be returned
		int[] calculated = {ceil, floor, round};
		
		return calculated;
		
	}
	
	public int numberOfStationWithLetterAvg()
	{
		char key = letterAverage();
		int numberOfStationWithLetterAvg = 0;
		
		for(int i = 0; i < size; ++i)
		{
			if(stations[i].charAt(0) == key)
			{
				++numberOfStationWithLetterAvg;
			}
		}
		
		return numberOfStationWithLetterAvg;
	}

}
