import java.io.IOException;

/**
 * @author Mohammad Mukhtaruzzaman
 * @version 2019-09-18
*/
public class MesoStation 
{
	private static String stID;
	
	public MesoStation(String stId)
	{
		this.stID = stId;
		
	}

	public static String getStID() {
		return stID;
	}
}