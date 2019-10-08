import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MesoInherit extends MesoStation
{
	protected static String[] stations = {"BYOB", "BOIS"};
	protected static int size = 0;
	
	public MesoInherit(String stId) 
	{
		super(stId);
	}
	
	public static void readIn() throws IOException {
		//try to read in the file with a scanner
		try {
			String str = "Mesonet";
			File file = new File(str);
			Scanner in = new Scanner(file);

			//read in the first 2 unusable lines
			in.nextLine();
			in.nextLine();
			

			//set up some variables 
			boolean hasInt = false;
			String string1;
			String string2;
			
			//while there is a next line...
			while (in.hasNext()) {
				hasInt = false;
				string1 = in.next();//.next so that only one grouping is read in at a time
				string2 = in.next();

				for (Integer i = 0; i < 10; ++i) {
					// find out if the string has a number in it
					if (string1.contains(i.toString())) {//checks to see if the string has any number from 0 to 9 in it
						hasInt = true;
					}
				}

				// if there was no int in the first string try the second
				if (hasInt == false) {
					stations[size] = string1;
					++size;
					
					
					for (Integer i = 0; i < 10; ++i) {
						// find out if the string has a number in it
						if (string2.contains(i.toString())) {
							hasInt = true;
						}
					}
					//if second has an int, add it
					if (hasInt == false) {
						stations[size] = string1;
						++size;
					}

				}
			}

			in.close();
		}//close the scanner at the end of the try block for good luck

		// catch the exception
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int[] calAverage()
	{
		return calAverage();
	}
	
	public char letterAverage()
	{
		LetterAvg j = new LetterAvg(super.getStID());
		return letterAverage();
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
