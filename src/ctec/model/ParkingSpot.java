package ctec.model;

public class ParkingSpot
{
	private boolean isTaken;
	private String carBrand;
	
	public ParkingSpot()
	{
		isTaken = false;
		carBrand = "uknown car";
	}
	
	public ParkingSpot(boolean isTaken, String carBrand)
	{
		this.isTaken = isTaken;
		this.carBrand = carBrand;
	}
	
	public String toString()
	{
		if(this.isTaken())
		{
			return "This spot is filled with a " + carBrand + ".";
		}
		else
		{
			return "this spot is open.";
		}
	}

	public boolean isTaken()
	{
		return isTaken;
	}

	public void setTaken(boolean isTaken)
	{
		this.isTaken = isTaken;
	}

	public String getCarBrand()
	{
		return carBrand;
	}

	public void setCarBrand(String carBrand)
	{
		this.carBrand = carBrand;
	}
}
