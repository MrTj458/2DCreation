package ctec.model;

public class ParkingSpot
{
	private boolean isTaken;
	
	public ParkingSpot()
	{
		isTaken = false;
	}
	
	public ParkingSpot(boolean isTaken)
	{
		this.isTaken = isTaken;
	}

	public boolean isTaken()
	{
		return isTaken;
	}

	public void setTaken(boolean isTaken)
	{
		this.isTaken = isTaken;
	}
}
