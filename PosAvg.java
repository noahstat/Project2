import java.util.Arrays;

public class PosAvg extends MesoInherit
{
	
	private static int index = 0;
	
	public PosAvg(String ID)
	{	
		super(ID);
			
		//find the index of the element for other calculations
		this.index = Arrays.binarySearch(MesoInherit.stations, 0, MesoInherit.size, ID);
		//in stations from 0 to size searching for ID
		
	}
	
	public int indexOfStation()
	{
		return index;
	}
	
	@Override
	public String toString()
	{
		//output should look like:
		//This index is average of NOWA and OILT, NEWP and OKCE, and so on.
		
		//holds the four stations around it
		String[] out = getAverages();
		
		String string = "This index is average of " + out[0] + " and " + out[1] + ", " 
				+ out[2] + " and " + out[3] + ", and so on.";
		
		return string;
	}

	public String[] getAverages() 
	{
		//first two will be one average and second two will be the other averages
		String[] aves = new String[4];
		
		if(index < 2 || index > (size - 2))
		{
			return aves;
		}
		else
		{
			//i is where we are getting the info and k is where we're storing the info both are there for simplicity
			for(int i = index - 2, k = 0; i < index + 2;++i, ++k)
			{
				aves[k] = stations[i];
			}
			return aves;
			
		}
	}
	
}
