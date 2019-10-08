import java.util.Arrays;

/*If the index is 77, then, 77 is the average of 76(NOWA) and 78(OILT). It�s also the average of 75(NEWP) and
79(OKCE). Showing up to two stations is enough.
Note: since you are calculating up to N+2 or N-2, if you give the first two stations or last two stations as input, it will
generate error. Therefore, you can skip giving the first two stations or last two stations as input.*/

public class PosAvg extends MesoInherit
{
	
	private static int index = 0;
	
	public PosAvg(String ID)
	{	
		super(ID);
			
		//find the index of the element for other calculations
		this.index = Arrays.binarySearch(MesoInherit.stations, 0, MesoInherit.size, ID);//in stations from 0 to size searching for ID
		
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
			for(int i = index - 2, k = 0; i < index + 4;++i, ++k)
			{
				aves[k] = stations[i];
			}
			return aves;
			
		}
	}
	
}
