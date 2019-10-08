import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MesoInherit extends MesoStation
{
	protected static String[] stations = {"BYOB", "BOIS", "ITSA", "MEEE"};
	protected static int size = 0;
	
	public MesoInherit(String stId) 
	{
		//make the object
		super(stId);
		
		//try to read in so we have that data, there will be an array for every MesoInherit object
		try {
			readIn();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public MesoInherit(MesoStation mesoStation) 
	{
		super(mesoStation.getStID());
	}

	protected static void readIn() throws IOException {
		//try to read in the file with a scanner
		try {
			String str = "Mesonet.txt";
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
				
				//if there is not room for the next two items read in
				if(size + 2 >= stations.length)
				{
					expand();
				}

				for (Integer i = 0; i < 10; ++i) {
					// find out if the string has a number in it
					if (string1.contains(i.toString())) {//checks to see if the string has any number from 0 to 9 in it
						hasInt = true;
					}
				}

				// if there was no int in the first string add it and try the second
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
	
	private static void expand()
	{
		int newSize = size + 20;
		String[] replacement = new String[newSize];
		
		//for the length of the stations, all extra spots will be null
		for(int i = 0; i < stations.length; ++i)
		{
			replacement[i] = stations[i];
		}
		
		stations = replacement;
	}
	
	public int[] calAverage()
	{
		LetterAvg j = new LetterAvg(super.getStID());
		return j.calAverage();
	}
	
	public char letterAverage()
	{
		LetterAvg j = new LetterAvg(super.getStID().charAt(0));
		return j.letterAverage();
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
