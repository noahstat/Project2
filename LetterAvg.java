//problem here
public class LetterAvg extends MesoInherit
{
	private char key;
//	protected static String stId = getStID();
	protected char letterAvg = ' ';
	protected int numberOfStations = -1;
	
	public LetterAvg(char c) 
	{
		super("PLEA");//just setting this to whatever
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
			sum += (int)c;//casting gets the ascii value
			
		}
		
		//actually take the average
		sum = sum / 4;
		
		ceil = (int)Math.ceil(sum);
//		System.out.println("Ascii Ceiling is " + ceil);
		floor = (int)Math.floor(sum);
//		System.out.println("Ascii Floor is " + floor);
		round = (int)Math.round(sum);
//		System.out.println("Ascii Average is " + round);
		letterAvg = (char)round;
		
		return letterAvg;
		
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
		int numberOfStationWithLetterAvg = 0;
		String toBeSearched = "";
		
		//find the stations with the same latter as the letter average
		for(int i = 0; i < size; ++i)
		{
			toBeSearched = stations[i];
			if(toBeSearched.equals(null))
			{
				break;
			}
			else if(toBeSearched.charAt(0) == key)
			{
				++numberOfStationWithLetterAvg;
			}
		}
		
		numberOfStations = numberOfStationWithLetterAvg;
		return numberOfStationWithLetterAvg;
	}
	
	public String toString()
	{
		//for some reason this doesn't always output correctly on zylabs
		String output ="\nThey are:\n";
		int currNumber = 0;
		char charAt = 'L';// random value to have it not be null
		int i = 0;
		int numberOfStations = numberOfStationWithLetterAvg();
		
		while(currNumber < numberOfStations)
		{
			
			charAt = stations[i].charAt(0);
			
			if(charAt == key)
				{
				//dont mess up whitespace
					if(currNumber == numberOfStations -1)
					{
						String toBeAdded = stations[i];
						output = output + toBeAdded;
						++currNumber;
					}
					else
					{
						String toBeAdded = stations[i] + "\n";
						output = output + toBeAdded;
						++currNumber;
					}
				}
			
			++i;
		}
		
		return output;
	}
	
}
