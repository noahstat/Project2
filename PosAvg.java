import java.util.Arrays;

/*If the index is 77, then, 77 is the average of 76(NOWA) and 78(OILT). It’s also the average of 75(NEWP) and
79(OKCE). Showing up to two stations is enough.
Note: since you are calculating up to N+2 or N-2, if you give the first two stations or last two stations as input, it will
generate error. Therefore, you can skip giving the first two stations or last two stations as input.*/

public class PosAvg extends MesoInherit
{
	
	private int index = 0;
	
	public PosAvg(String ID)
	{	
			super(ID);
			
		//find the index of the element for other calculations
		this.index = Arrays.binarySearch(MesoInherit.stations, 0, MesoInherit.size, ID);
		
	}
	
	
}
