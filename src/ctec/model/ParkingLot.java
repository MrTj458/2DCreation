package ctec.model;

public class ParkingLot
{
////////////////////Setup////////////////////
	private boolean[][] parkingLot;
	private String[] colNames;
	
	public ParkingLot()
	{
		parkingLot = new boolean[4][5];
		colNames = new String[5];
		
		setupColNames();
		setupParkingLot();
	}
	
	public ParkingLot(int rows, int columns)
	{
		parkingLot = new boolean[rows][columns];
		colNames = new String[columns];
		
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
				parkingLot[row][col] = false;
			}
		}
	}
	
////////////////////Methods////////////////////	
	
	public boolean isTaken(int row, int col)
	{
		boolean isTaken = false;
		
		if(parkingLot[row][col] == true)
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
	
	public boolean[][] getParkingLotArray()
	{
		return parkingLot;
	}
	
	public String[] getColumnNames()
	{
		return colNames;
	}
}
