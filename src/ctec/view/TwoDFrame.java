package ctec.view;

import ctec.controller.TwoDController;
import javax.swing.JFrame;

public class TwoDFrame extends JFrame
{
	private TwoDController baseController;
	private TwoDPanel basePanel;
	
	public TwoDFrame(TwoDController baseController)
	{
		this.baseController = baseController;
		basePanel = new TwoDPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500, 500);
		this.setTitle("2D Array Project");
		this.setVisible(true);
	}
}
