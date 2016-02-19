package ctec.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import ctec.controller.TwoDController;

public class TwoDPanel extends JPanel
{
	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JButton setTakenButton;
	private JButton setOpenButton;
	private JTextField rowField;
	private JTextField colField;

	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		setTakenButton = new JButton("Set Taken");
		setOpenButton = new JButton("Set Open");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(setOpenButton);
		this.add(setTakenButton);
		this.add(rowField);
		this.add(colField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, setTakenButton, 0, SpringLayout.NORTH, setOpenButton);
		baseLayout.putConstraint(SpringLayout.WEST, setTakenButton, 6, SpringLayout.EAST, setOpenButton);
		baseLayout.putConstraint(SpringLayout.WEST, setOpenButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, setOpenButton, -10, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		
	}
}