package demo;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;

public class demo_frame extends JFrame {
	int color = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo_frame frame = new demo_frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public demo_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFill = new JLabel("Fill the Blank with Color");
		lblFill.setFont(new Font("Calibri", Font.BOLD, 24));
		lblFill.setBounds(440, 83, 300, 51);
		contentPane.add(lblFill);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 161, 624, 319);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 11, 0, 0));
		
		JButton btnNewButton_1 = new JButton("");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_15 = new JButton("");
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_10 = new JButton("");
		panel.add(btnNewButton_10);
		
		JButton btnNewButton = new JButton("");
		panel.add(btnNewButton);
		
		JButton btnNewButton_12 = new JButton("");
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("");
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_7 = new JButton("");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_16 = new JButton("");
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_9 = new JButton("");
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_20 = new JButton("");
		panel.add(btnNewButton_20);
		
		JButton btnNewButton_25 = new JButton("");
		panel.add(btnNewButton_25);
		
		JButton btnNewButton_13 = new JButton("");
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("");
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_17 = new JButton("");
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("");
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("");
		panel.add(btnNewButton_19);
		
		JButton btnNewButton_35 = new JButton("");
		panel.add(btnNewButton_35);
		
		JButton btnNewButton_21 = new JButton("");
		panel.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("");
		panel.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("");
		panel.add(btnNewButton_23);
		
		JButton btnNewButton_30 = new JButton("");
		panel.add(btnNewButton_30);
		
		JButton btnNewButton_32 = new JButton("");
		panel.add(btnNewButton_32);
		
		JButton btnNewButton_24 = new JButton("");
		panel.add(btnNewButton_24);
		
		JButton btnNewButton_26 = new JButton("");
		panel.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("");
		panel.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("");
		panel.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("");
		panel.add(btnNewButton_29);
		
		JButton btnNewButton_31 = new JButton("");
		panel.add(btnNewButton_31);
		
		JButton btnNewButton_33 = new JButton("");
		panel.add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("");
		panel.add(btnNewButton_34);
		
		JButton btnNewButton_36 = new JButton("");
		panel.add(btnNewButton_36);
		
		JButton btnNewButton_40 = new JButton("");
		panel.add(btnNewButton_40);
		
		JButton btnNewButton_37 = new JButton("");
		panel.add(btnNewButton_37);
		
		JButton btnNewButton_38 = new JButton("");
		panel.add(btnNewButton_38);
		
		JButton btnNewButton_39 = new JButton("");
		panel.add(btnNewButton_39);
		
		JButton btnNewButton_41 = new JButton("");
		panel.add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("");
		panel.add(btnNewButton_42);
		
		JButton btnNewButton_43 = new JButton("");
		panel.add(btnNewButton_43);
		
		JButton btnNewButton_45 = new JButton("");
		panel.add(btnNewButton_45);
		
		JButton btnNewButton_50 = new JButton("");
		panel.add(btnNewButton_50);
		
		JButton btnNewButton_44 = new JButton("");
		panel.add(btnNewButton_44);
		
		JButton btnNewButton_46 = new JButton("");
		panel.add(btnNewButton_46);
		
		JButton btnNewButton_47 = new JButton("");
		panel.add(btnNewButton_47);
		
		JButton btnNewButton_48 = new JButton("");
		panel.add(btnNewButton_48);
		
		JButton btnNewButton_49 = new JButton("");
		panel.add(btnNewButton_49);
		
		JButton btnNewButton_51 = new JButton("");
		panel.add(btnNewButton_51);
		
		JButton btnNewButton_52 = new JButton("");
		panel.add(btnNewButton_52);
		
		JButton btnNewButton_53 = new JButton("");
		panel.add(btnNewButton_53);
		
		JButton btnNewButton_54 = new JButton("");
		panel.add(btnNewButton_54);
		
		
		
		/**
		 *  Panel 1 created to keep radio buttons 
		 */
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(721, 161, 407, 319);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 4, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Red");
		rdbtnNewRadioButton_1.setBackground(Color.RED);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Light Gray");
		rdbtnNewRadioButton_2.setBackground(Color.LIGHT_GRAY);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Magenta");
		rdbtnNewRadioButton_9.setBackground(Color.MAGENTA);
		panel_1.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Black");
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBackground(Color.BLACK);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Yellow");
		rdbtnNewRadioButton_4.setBackground(Color.YELLOW);
		rdbtnNewRadioButton_4.setForeground(Color.BLACK);
		panel_1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Dark Gray");
		rdbtnNewRadioButton_11.setBackground(Color.DARK_GRAY);
		panel_1.add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("White");
		rdbtnNewRadioButton_10.setBackground(Color.WHITE);
		panel_1.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Green");
		rdbtnNewRadioButton_5.setBackground(Color.GREEN);
		panel_1.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Orange");
		rdbtnNewRadioButton_8.setBackground(Color.ORANGE);
		panel_1.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Pink");
		rdbtnNewRadioButton_6.setBackground(Color.PINK);
		panel_1.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Cyan");
		rdbtnNewRadioButton_7.setBackground(Color.CYAN);
		panel_1.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Blue");
		rdbtnNewRadioButton_3.setForeground(Color.WHITE);
		rdbtnNewRadioButton_3.setBackground(Color.BLUE);
		panel_1.add(rdbtnNewRadioButton_3);
		
		
		ButtonGroup rdbg =new ButtonGroup();
		rdbg.add(rdbtnNewRadioButton);
		rdbg.add(rdbtnNewRadioButton_1);
		rdbg.add(rdbtnNewRadioButton_2);
		rdbg.add(rdbtnNewRadioButton_3);
		rdbg.add(rdbtnNewRadioButton_4);
		rdbg.add(rdbtnNewRadioButton_5);
		rdbg.add(rdbtnNewRadioButton_6);
		rdbg.add(rdbtnNewRadioButton_7);
		rdbg.add(rdbtnNewRadioButton_8);
		rdbg.add(rdbtnNewRadioButton_9);
		rdbg.add(rdbtnNewRadioButton_10);
		rdbg.add(rdbtnNewRadioButton_11);
		
		
		
		/**
		 *  Panel 2 created to keep options
		 */
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(352, 28, 414, 42);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnFlat = new JButton("Flat");
		panel_2.add(btnFlat);
		
		JButton btnDiagonal = new JButton("Diagonal");
		panel_2.add(btnDiagonal);
		
		JButton btnd = new JButton("3-D");
		panel_2.add(btnd);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setBounds(524, 558, 97, 25);
		contentPane.add(btnCheck);
		
		
		/**
		 *  Action listener created in order to paint buttons 
		 *  according to chosen radio button
		 */
		
		
		// action listener for radio button
		
		ActionListener radioButtonListener = new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    	if (e.getSource() == rdbtnNewRadioButton) {
		    		color = 0;  // black
		    		System.out.println(color);
		    	}
		    	if (e.getSource() == rdbtnNewRadioButton_1) {
		    		color = 1; 	// red
		    		System.out.println(color);
		    	}
		    	if (e.getSource() == rdbtnNewRadioButton_2) {
		    		color = 2;	// light gray
		    		System.out.println(color);
		    	}
		    	if (e.getSource() == rdbtnNewRadioButton_3) {
		    		color = 3;	// blue
		    		System.out.println(color);
		    	}
		    	if (e.getSource() == rdbtnNewRadioButton_4) {
		    		color = 4;	// yellow
		    		System.out.println(color);
		    	}
		    	if (e.getSource() == rdbtnNewRadioButton_5)
		    		color = 5;	// green
		    	if (e.getSource() == rdbtnNewRadioButton_6)
		    		color = 6;	// pink
		    	if (e.getSource() == rdbtnNewRadioButton_7)
		    		color = 7;	// cyan
		    	if (e.getSource() == rdbtnNewRadioButton_8)
		    		color = 8;	// orange
		    	if (e.getSource() == rdbtnNewRadioButton_9)
		    		color = 9;	// magenta
		    	if (e.getSource() == rdbtnNewRadioButton_10)
		    		color = 10;	//white 
		    	if (e.getSource() == rdbtnNewRadioButton_11)
		    		color = 11;	//dark gray
		    	
		    }
		};
		
		
		
		rdbtnNewRadioButton.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_1.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_2.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_3.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_4.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_5.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_6.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_7.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_8.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_9.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_10.addActionListener( radioButtonListener );
		rdbtnNewRadioButton_11.addActionListener( radioButtonListener );
		
		
		ActionListener buttonListener =new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	JButton buttonlistened = (JButton ) e.getSource();
		    	System.out.println(buttonlistened);
		    	if(color==0)
		    		buttonlistened.setBackground(Color.BLACK);
		    	if(color==1)
		    		buttonlistened.setBackground(Color.RED);
		    	if(color==2)
		    		buttonlistened.setBackground(Color.LIGHT_GRAY);
		    	if(color==3)
		    		buttonlistened.setBackground(Color.BLUE);
		    	if(color==4)
		    		buttonlistened.setBackground(Color.YELLOW);
		    	if(color==5)
		    		buttonlistened.setBackground(Color.GREEN);
		    	if(color==6)
		    		buttonlistened.setBackground(Color.PINK);
		    	if(color==7)
		    		buttonlistened.setBackground(Color.CYAN);
		    	if(color==8)
		    		buttonlistened.setBackground(Color.ORANGE);
		    	if(color==9)
		    		buttonlistened.setBackground(Color.MAGENTA);
		    	if(color==10)
		    		buttonlistened.setBackground(Color.WHITE);
		    	if(color==11)
		    		buttonlistened.setBackground(Color.DARK_GRAY);
		    	
		    }
		};
		
		btnNewButton.addActionListener( buttonListener );
		btnNewButton_1.addActionListener( buttonListener );
		btnNewButton_2.addActionListener( buttonListener );
		btnNewButton_3.addActionListener( buttonListener );
		btnNewButton_4.addActionListener( buttonListener );
		btnNewButton_5.addActionListener( buttonListener );
		btnNewButton_6.addActionListener( buttonListener );
		btnNewButton_7.addActionListener( buttonListener );
		btnNewButton_8.addActionListener( buttonListener );
		btnNewButton_9.addActionListener( buttonListener );
		btnNewButton_10.addActionListener( buttonListener );
		btnNewButton_11.addActionListener( buttonListener );
		btnNewButton_12.addActionListener( buttonListener );
		btnNewButton_13.addActionListener( buttonListener );
		btnNewButton_14.addActionListener( buttonListener );
		btnNewButton_15.addActionListener( buttonListener );
		btnNewButton_16.addActionListener( buttonListener );
		btnNewButton_17.addActionListener( buttonListener );
		btnNewButton_18.addActionListener( buttonListener );
		btnNewButton_19.addActionListener( buttonListener );
		btnNewButton_20.addActionListener( buttonListener );
		btnNewButton_21.addActionListener( buttonListener );
		btnNewButton_22.addActionListener( buttonListener );
		btnNewButton_23.addActionListener( buttonListener );
		btnNewButton_24.addActionListener( buttonListener );
		btnNewButton_25.addActionListener( buttonListener );
		btnNewButton_26.addActionListener( buttonListener );
		btnNewButton_27.addActionListener( buttonListener );
		btnNewButton_28.addActionListener( buttonListener );
		btnNewButton_29.addActionListener( buttonListener );
		btnNewButton_30.addActionListener( buttonListener );
		btnNewButton_31.addActionListener( buttonListener );
		btnNewButton_32.addActionListener( buttonListener );
		btnNewButton_33.addActionListener( buttonListener );
		btnNewButton_34.addActionListener( buttonListener );
		btnNewButton_35.addActionListener( buttonListener );
		btnNewButton_36.addActionListener( buttonListener );
		btnNewButton_37.addActionListener( buttonListener );
		btnNewButton_38.addActionListener( buttonListener );
		btnNewButton_39.addActionListener( buttonListener );
		btnNewButton_40.addActionListener( buttonListener );
		btnNewButton_41.addActionListener( buttonListener );
		btnNewButton_42.addActionListener( buttonListener );
		btnNewButton_43.addActionListener( buttonListener );
		btnNewButton_44.addActionListener( buttonListener );
		btnNewButton_45.addActionListener( buttonListener );
		btnNewButton_46.addActionListener( buttonListener );
		btnNewButton_47.addActionListener( buttonListener );
		btnNewButton_48.addActionListener( buttonListener );
		btnNewButton_49.addActionListener( buttonListener );
		btnNewButton_50.addActionListener( buttonListener );
		btnNewButton_51.addActionListener( buttonListener );
		btnNewButton_52.addActionListener( buttonListener );
		btnNewButton_53.addActionListener( buttonListener );
		btnNewButton_54.addActionListener( buttonListener );
		
		
		
		/*
		btnNewButton_1.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){  
		            if (e.getSource() == rdbtnNewRadioButton_1)
		            	btnNewButton_1.setBackground(COLOR.red);
		    }  
		    }); */
		

	}
}
