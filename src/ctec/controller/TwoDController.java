package ctec.controller;

import ctec.view.TwoDFrame;
import ctec.model.ParkingLot;

public class TwoDController
{
	private ParkingLot parkingLot;
	private TwoDFrame baseFrame;
	
	public TwoDController()
	{
		parkingLot = new ParkingLot();
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
