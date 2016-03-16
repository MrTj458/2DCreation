package ctec.controller;

import ctec.view.TwoDFrame;
import ctec.model.ParkingSpot;

public class TwoDController
{
	private TwoDFrame baseFrame;
	private ParkingSpot[][] lotSpots;
	
	public TwoDController()
	{
		lotSpots = new ParkingSpot[4][5];
		setupArray();
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{

	}
	
	private void setupArray()
	{
		for(int row = 0; row < lotSpots.length; row++)
		{
			for(int col = 0; col < lotSpots[0].length; col++)
			{
				lotSpots[row][col] = new ParkingSpot();
				if(row % 2 == 1)
				{
					lotSpots[row][col].setTaken(true);
				}
				else
				{
					lotSpots[row][col].setTaken(false);
				}
			}
		}
	}
	
	public void setSpot(int row, int col, boolean isTaken)
	{
		lotSpots[row][col].setTaken(isTaken);
	}
	
	public void setSpot(int row, int col, String carBrand)
	{
		lotSpots[row][col].setCarBrand(carBrand);
	}
	
	public boolean checkTaken(int row, int col)
	{
		return lotSpots[row][col].isTaken();
	}
	
	public String getBrand(int row, int col)
	{
		return lotSpots[row][col].getCarBrand();
	}
	
	public ParkingSpot[][] getLot()
	{
		return lotSpots;
	}
}
