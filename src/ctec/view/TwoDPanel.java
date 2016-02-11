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
	private JLabel label00;
	private JLabel label01;
	private JLabel label02;
	private JLabel label03;
	private JLabel label04;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label20;
	private JLabel label21;
	private JLabel label22;
	private JLabel label23;
	private JLabel label24;
	private JLabel label30;
	private JLabel label31;
	private JLabel label32;
	private JLabel label33;
	private JLabel label34;
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		setTakenButton = new JButton("Set Taken");
		baseLayout.putConstraint(SpringLayout.EAST, setTakenButton, -10, SpringLayout.EAST, this);
		setOpenButton = new JButton("Set Open");
		baseLayout.putConstraint(SpringLayout.NORTH, setTakenButton, 0, SpringLayout.NORTH, setOpenButton);
		baseLayout.putConstraint(SpringLayout.WEST, setOpenButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, setOpenButton, -10, SpringLayout.SOUTH, this);
		rowField = new JTextField("Row");
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, -1, SpringLayout.NORTH, setOpenButton);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 6, SpringLayout.EAST, setOpenButton);
		baseLayout.putConstraint(SpringLayout.EAST, rowField, 111, SpringLayout.EAST, setOpenButton);
		colField = new JTextField("Col");
		baseLayout.putConstraint(SpringLayout.NORTH, colField, -1, SpringLayout.NORTH, setOpenButton);
		baseLayout.putConstraint(SpringLayout.WEST, colField, -130, SpringLayout.WEST, setTakenButton);
		baseLayout.putConstraint(SpringLayout.EAST, colField, -6, SpringLayout.WEST, setTakenButton);
		label00 = new JLabel("00");
		baseLayout.putConstraint(SpringLayout.NORTH, label00, 57, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, label00, 77, SpringLayout.WEST, this);
		label01 = new JLabel("01");
		baseLayout.putConstraint(SpringLayout.NORTH, label01, 0, SpringLayout.NORTH, label00);
		baseLayout.putConstraint(SpringLayout.WEST, label01, 6, SpringLayout.EAST, label00);
		label02 = new JLabel("02");
		baseLayout.putConstraint(SpringLayout.NORTH, label02, 0, SpringLayout.NORTH, label00);
		baseLayout.putConstraint(SpringLayout.WEST, label02, 6, SpringLayout.EAST, label01);
		label03 = new JLabel("03");
		baseLayout.putConstraint(SpringLayout.NORTH, label03, 0, SpringLayout.NORTH, label00);
		baseLayout.putConstraint(SpringLayout.WEST, label03, 6, SpringLayout.EAST, label02);
		label04 = new JLabel("04");
		baseLayout.putConstraint(SpringLayout.NORTH, label04, 0, SpringLayout.NORTH, label00);
		baseLayout.putConstraint(SpringLayout.WEST, label04, 6, SpringLayout.EAST, label03);
		label10 = new JLabel("10");
		baseLayout.putConstraint(SpringLayout.NORTH, label10, 6, SpringLayout.SOUTH, label00);
		baseLayout.putConstraint(SpringLayout.EAST, label10, 0, SpringLayout.EAST, label00);
		label11 = new JLabel("11");
		baseLayout.putConstraint(SpringLayout.NORTH, label11, 0, SpringLayout.NORTH, label10);
		baseLayout.putConstraint(SpringLayout.WEST, label11, 0, SpringLayout.WEST, label01);
		label12 = new JLabel("12");
		baseLayout.putConstraint(SpringLayout.NORTH, label12, 0, SpringLayout.NORTH, label10);
		baseLayout.putConstraint(SpringLayout.WEST, label12, 0, SpringLayout.WEST, label02);
		label13 = new JLabel("13");
		baseLayout.putConstraint(SpringLayout.NORTH, label13, 0, SpringLayout.NORTH, label10);
		baseLayout.putConstraint(SpringLayout.WEST, label13, 0, SpringLayout.WEST, label03);
		label14 = new JLabel("14");
		baseLayout.putConstraint(SpringLayout.NORTH, label14, 0, SpringLayout.NORTH, label10);
		baseLayout.putConstraint(SpringLayout.WEST, label14, 6, SpringLayout.EAST, label13);
		label20 = new JLabel("20");
		baseLayout.putConstraint(SpringLayout.NORTH, label20, 6, SpringLayout.SOUTH, label10);
		baseLayout.putConstraint(SpringLayout.WEST, label20, 0, SpringLayout.WEST, label00);
		label21 = new JLabel("21");
		baseLayout.putConstraint(SpringLayout.NORTH, label21, 0, SpringLayout.NORTH, label20);
		baseLayout.putConstraint(SpringLayout.WEST, label21, 0, SpringLayout.WEST, label01);
		label22 = new JLabel("22");
		baseLayout.putConstraint(SpringLayout.NORTH, label22, 0, SpringLayout.NORTH, label20);
		baseLayout.putConstraint(SpringLayout.WEST, label22, 0, SpringLayout.WEST, label02);
		label23 = new JLabel("23");
		baseLayout.putConstraint(SpringLayout.NORTH, label23, 0, SpringLayout.NORTH, label20);
		baseLayout.putConstraint(SpringLayout.WEST, label23, 0, SpringLayout.WEST, label03);
		label24 = new JLabel("24");
		baseLayout.putConstraint(SpringLayout.NORTH, label24, 6, SpringLayout.SOUTH, label14);
		baseLayout.putConstraint(SpringLayout.WEST, label24, 0, SpringLayout.WEST, label04);
		label30 = new JLabel("30");
		baseLayout.putConstraint(SpringLayout.NORTH, label30, 6, SpringLayout.SOUTH, label20);
		baseLayout.putConstraint(SpringLayout.EAST, label30, 0, SpringLayout.EAST, label00);
		label31 = new JLabel("31");
		baseLayout.putConstraint(SpringLayout.NORTH, label31, 0, SpringLayout.NORTH, label30);
		baseLayout.putConstraint(SpringLayout.WEST, label31, 0, SpringLayout.WEST, label01);
		label32 = new JLabel("32");
		baseLayout.putConstraint(SpringLayout.NORTH, label32, 0, SpringLayout.NORTH, label30);
		baseLayout.putConstraint(SpringLayout.WEST, label32, 0, SpringLayout.WEST, label02);
		label33 = new JLabel("33");
		baseLayout.putConstraint(SpringLayout.NORTH, label33, 0, SpringLayout.NORTH, label30);
		baseLayout.putConstraint(SpringLayout.WEST, label33, 0, SpringLayout.WEST, label03);
		label34 = new JLabel("34");
		baseLayout.putConstraint(SpringLayout.NORTH, label34, 0, SpringLayout.NORTH, label30);
		baseLayout.putConstraint(SpringLayout.WEST, label34, 0, SpringLayout.WEST, label04);
		
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
		this.add(label00);
		this.add(label01);
		this.add(label02);
		this.add(label03);
		this.add(label04);
		this.add(label10);
		this.add(label11);
		this.add(label12);
		this.add(label13);
		this.add(label14);
		this.add(label20);
		this.add(label21);
		this.add(label22);
		this.add(label23);
		this.add(label24);
		this.add(label30);
		this.add(label31);
		this.add(label32);
		this.add(label33);
		this.add(label34);
	}
	
	private void setupLayout()
	{

	}
	
	private void setupListeners()
	{
		
	}
}