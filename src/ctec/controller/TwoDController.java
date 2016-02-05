package ctec.controller;

import ctec.view.TwoDFrame;

public class TwoDController
{
	
	private TwoDFrame baseFrame;
	
	public TwoDController()
	{
		
	}
	
	public void start()
	{
		baseFrame = new TwoDFrame(this);
	}
}
