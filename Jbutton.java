

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.ListUI;
import javax.swing.plaf.basic.BasicListUI;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class Jbutton extends JFrame implements ActionListener
{
	SensorView sv = new SensorView();
	public Jbutton()
	{
		
		setSize(1000, 1000);
	    setLocation(100, 100);
		JFrame f = new JFrame("Lab 11");
		//f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JButton b1 = new JButton("b1");
		b1.addActionListener(this);
		JButton b2 = new JButton("b2");
		b2.addActionListener(this);
		JButton b3 = new JButton("b3");
		b3.addActionListener(this);
		JButton b4 = new JButton("b4");
		b4.addActionListener(this);
		JButton b5 = new JButton("b5");
		b5.addActionListener(this);
		JButton b6 = new JButton("b6");
		b6.addActionListener(this);
		JButton b7 = new JButton("b7");
		b7.addActionListener(this);
		JButton b8 = new JButton("b8");
		b8.addActionListener(this);
		
		
		setLayout(new GridLayout(4,2));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String command = e.getActionCommand();
	  	if (command.equals("b1")) {
            SensorView.sensors[0].interrupt();
        }
        if (command.equals("b2")) {
        	SensorView.sensors[1].interrupt();
        }
        if (command.equals("b3")) {
        	SensorView.sensors[2].interrupt();
        }
        if (command.equals("b4")) {
        	SensorView.sensors[3].interrupt();
        }
        if (command.equals("b5")) {
        	SensorView.sensors[4].interrupt();
        }
        if (command.equals("b6")) {
        	SensorView.sensors[5].interrupt();
        }
        if (command.equals("b7")) {
        	SensorView.sensors[6].interrupt();
        }
        if (command.equals("b8")) {
        	System.exit(0);
        }
        
	}
}
