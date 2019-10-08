
public class LetterAvg extends MesoInherit
{
	private char key;
	
	public LetterAvg(char c) 
	{
		
		super("c");
		this.key = c;
	}

	public char letterAverage()
	{
		//char.getNumericValue(char c);
		String stID = getStID();
		int ceil = 0;
		int floor = 0;
		int round = 0;
		double sum = 0.0;
		
		for(int i = 0; i < 4; ++i)
		{
			char c = stID.charAt(i);
			sum += Character.getNumericValue(c);
			
		}
		
		ceil = (int)Math.ceil(sum);
//		System.out.println("Ascii Ceiling is " + ceil);
		floor = (int)Math.floor(sum);
//		System.out.println("Ascii Floor is " + floor);
		round = (int)Math.round(sum);
//		System.out.println("Ascii Average is " + round);
		
		return 'O';
		
	}
	
	public int[] calAverage()
	{
		//char.getNumericValue(char c);
		String stID = getStID();
		int ceil = 0;
		int floor = 0;
		int round = 0;
		double sum = 0.0;
		
		for(int i = 0; i < 4; ++i)
		{
			char c = stID.charAt(i);
			sum += Character.getNumericValue(c);
			
		}
		
		/*Ascii Ceiling is 79
		Ascii Floor is 78
		Ascii Average is 79*/
		
		ceil = (int)Math.ceil(sum);
//		System.out.println("Ascii Ceiling is " + ceil);
		floor = (int)Math.floor(sum);
//		System.out.println("Ascii Floor is " + floor);
		round = (int)Math.round(sum);
//		System.out.println("Ascii Average is " + round);
		int[] calculated = {ceil, floor, round};
		
		/*You have to get the ASCII value for N R M and N as 78, 82, 77, and 78. Sum of these ASCII value is 315. Dividing
		315 by 4, we get 78.75*/
		
		return calculated;
		
	}

}
