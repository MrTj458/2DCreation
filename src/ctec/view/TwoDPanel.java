package ctec.view;

import ctec.controller.TwoDController;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTable;

public class TwoDPanel extends JPanel
{
	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTable table;
	private JScrollPane scrollPane;
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		table = new JTable(baseController.getParkingLot().getParkingLotArray(), baseController.getParkingLot().getColumnNames())
		{
			public boolean isCellEditable(int data, int columns)
			{
				return false;
			}
			
			public Component prepareRenderer(TableCellRenderer r, int data, int column)
			{
				Component c = super.prepareRenderer(r, data, column);
				
				if(data % 2 == 0)
				{
					c.setBackground(Color.WHITE);
				}
				else
				{
					c.setBackground(Color.LIGHT_GRAY);
				}
				
				if(isCellSelected(data, column))
				{
					c.setBackground(Color.GREEN);
				}
				
				return c;
			}
		};
		scrollPane = new JScrollPane(table);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		table.setPreferredScrollableViewportSize(new Dimension(470, 250));
		table.setFillsViewportHeight(true);
		this.add(scrollPane);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, table, 250, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, table, 250, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
