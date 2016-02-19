package ctec.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import ctec.controller.TwoDController;
import ctec.model.ParkingSpot;

public class TwoDPanel extends JPanel
{
	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JButton displayButton;
	private JButton changeButton;
	private JTextField rowField;
	private JTextField colField;
	private JTextField carBrandField;
	private JTable lotTable;
	private JLabel takenLabel;
	private JLabel brandLabel;
	private JLabel isTaken;
	private JLabel isTakenInfo;
	private JSpinner isTakenSpinner;

	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		displayButton = new JButton("Display the object");
		changeButton = new JButton("Change the object");
		rowField = new JTextField("Row");
		colField = new JTextField("Col");
		carBrandField = new JTextField("Car brand");
		takenLabel = new JLabel("Spot taken: ");
		brandLabel = new JLabel("The car in this spot is a: ");
		isTaken = new JLabel("Is the spot taken:");
		isTakenInfo = new JLabel("0 = open, 1 = taken");
		
		setupTable();
		setupSpinner();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0 ", "Column 1", "Column 2", "Column 3", "Column 4"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getLot(), columnHeaders);
		lotTable = new JTable(tableModel);
	}
	
	private void setupSpinner()
	{
		SpinnerModel spinnerModel = new SpinnerNumberModel(0, 0, 1, 1);
		isTakenSpinner = new JSpinner(spinnerModel);
		baseLayout.putConstraint(SpringLayout.NORTH, isTakenSpinner, 0, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.EAST, isTakenSpinner, 0, SpringLayout.EAST, carBrandField);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(displayButton);
		this.add(changeButton);
		this.add(rowField);
		this.add(colField);
		this.add(carBrandField);
		this.add(lotTable);
		this.add(takenLabel);
		this.add(brandLabel);
		this.add(isTakenSpinner);
		this.add(isTaken);
		this.add(isTakenInfo);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, lotTable, 25, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, takenLabel, -6, SpringLayout.NORTH, brandLabel);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rowField, -6, SpringLayout.NORTH, displayButton);
		baseLayout.putConstraint(SpringLayout.WEST, displayButton, 0, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.SOUTH, carBrandField, -12, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, isTaken, 6, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, isTaken, 0, SpringLayout.WEST, carBrandField);
		baseLayout.putConstraint(SpringLayout.WEST, colField, 6, SpringLayout.EAST, rowField);
		baseLayout.putConstraint(SpringLayout.NORTH, isTakenInfo, 0, SpringLayout.NORTH, brandLabel);
		baseLayout.putConstraint(SpringLayout.EAST, isTakenInfo, 0, SpringLayout.EAST, carBrandField);
		baseLayout.putConstraint(SpringLayout.SOUTH, colField, -6, SpringLayout.NORTH, displayButton);
		baseLayout.putConstraint(SpringLayout.WEST, brandLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, changeButton, 6, SpringLayout.EAST, displayButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, changeButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, displayButton, 0, SpringLayout.NORTH, changeButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, brandLabel, -6, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, lotTable, 25, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, lotTable, -25, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, carBrandField, 6, SpringLayout.EAST, changeButton);
		baseLayout.putConstraint(SpringLayout.WEST, takenLabel, 0, SpringLayout.WEST, displayButton);
		baseLayout.putConstraint(SpringLayout.EAST, carBrandField, -10, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		displayButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				ParkingSpot lot[][] = baseController.getLot();
				takenLabel.setText("Spot taken: " + Boolean.toString(lot[Integer.parseInt(rowField.getText())][Integer.parseInt(colField.getText())].isTaken()));
				brandLabel.setText("The car in this spot is a: " + lot[Integer.parseInt(rowField.getText())][Integer.parseInt(colField.getText())].getCarBrand());
			}
		});
	}
}