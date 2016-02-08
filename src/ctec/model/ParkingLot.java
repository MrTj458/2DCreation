package ctec.model;

public class ParkingLot
{
////////////////////Setup////////////////////
	private Object[][] parkingLot;
	private String[] colNames;
	
	public ParkingLot()
	{
		parkingLot = new Object[4][5];
		colNames = new String[5];
		
		setupColNames();
		setupParkingLot();
	}
	
	public ParkingLot(int rows, int cols)
	{
		parkingLot = new Object[rows][cols];
		colNames = new String[cols];
		
		setupColNames();
		setupParkingLot();
	}
	
	private void setupColNames()
	{
		for(int spot = 0; spot < colNames.length; spot++)
		{
			colNames[spot] = "Column " + (spot + 1);
		}
	}
	
	private void setupParkingLot()
	{
		for(int row = 0; row < parkingLot.length; row++)
		{
			for(int col = 0; col < parkingLot[0].length; col++)
			{
				int isTaken = (int) (Math.random() * 2);
				
				if(isTaken > 0)
				{
					parkingLot[row][col] = "true";
				}
				else
				{
					parkingLot[row][col] = "false";
				}
			}
		}
	}
	
////////////////////Methods////////////////////	
	
	public boolean isTaken(int row, int col)
	{
		boolean isTaken = false;
		
		if(parkingLot[row][col].equals("true"))
		{
			isTaken = true;
		}
		
		return isTaken;
	}
	
	public int openSpots()
	{
		int openSpots = 0;
		
		for(int row = 0; row < parkingLot.length; row++)
		{
			for(int col = 0; col < parkingLot[0].length; col++)
			{
				if(!isTaken(row, col))
				{
					openSpots++;
				}
			}
		}
		
		return openSpots;
	}
	
	public int takenSpots()
	{
		int takenSpots = 0;
		
		for(int row = 0; row < parkingLot.length; row++)
		{
			for(int col = 0; col < parkingLot[0].length; col++)
			{
				if(isTaken(row, col))
				{
					takenSpots++;
				}
			}
		}
		
		return takenSpots;
	}
	
	public Object[][] getParkingLotArray()
	{
		return parkingLot;
	}
	
	public String[] getColumnNames()
	{
		return colNames;
	}
}
