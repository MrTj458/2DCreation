package ctec.controller;

import ctec.view.TwoDFrame;
import ctec.model.ParkingLot;

public class TwoDController
{
	private ParkingLot parkingLot;
	private TwoDFrame baseFrame;
	
	public TwoDController()
	{
		parkingLot = new ParkingLot(12, 5);
	}
	
	public void start()
	{
		baseFrame = new TwoDFrame(this);
	}
	
	public ParkingLot getParkingLot()
	{
		return parkingLot;
	}
}
