/*

 */ 

package layout;

/*
 * GridLayoutDemo.java
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GridLayoutDemo extends JFrame {

    GridLayout experimentLayout = new GridLayout(5,11);
    
    public GridLayoutDemo(String name) {
        super(name);
        setResizable(false);
    }

    
    public void addComponentsToPane(final Container pane) {
      
      
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(0,2));
        
        //Set up components preferred size
        JButton b = new JButton(" dsfsdfsdfsdfsdffake ");
        Dimension buttonSize = b.getPreferredSize();
        compsToExperiment.setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 2.5)+20,
                (int)(buttonSize.getHeight() * 3.5)+20 * 2));
        
        int[] arr = {1,1,1,2,2,2,3,4,4,4,4,5,5,1,1,6,2,3,3,4,7,7,5,5,6,6,6,2,8,8,9,9,7,10,5,10,6,11,11,12,8,8,9,7,10,10,10,11,11,12,12,12,8,9,7};
        System.out.println(arr.length);
        //Add buttons to experiment with Grid Layout
             final JButton[] buttons = new JButton[55]; 
              setButtonColors(arr, buttons);
              
              for(int i = 0 ; i < 55; i++)
                buttons[i].setEnabled(true);
              
              for(int i = 0; i  < 55; i++){
                compsToExperiment.add(buttons[i]);
              }
        //Set up the horizontal gap value
                experimentLayout.setHgap(10);
                //Set up the vertical gap value
                experimentLayout.setVgap(10);
                //Set up the layout of the buttons
                experimentLayout.layoutContainer(compsToExperiment);
  
        pane.add(compsToExperiment, BorderLayout.NORTH);
        pane.add(new JSeparator(), BorderLayout.CENTER);
        pane.add(controls, BorderLayout.SOUTH);
        
        ButtonGroup group1 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "1")
          group1.add(buttons[i]);
        
                ButtonGroup group2 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "2")
          group2.add(buttons[i]);
        
                ButtonGroup group3 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "3")
          group3.add(buttons[i]);
        
                ButtonGroup group4 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "4")
          group4.add(buttons[i]);
        
                ButtonGroup group5 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "5")
          group5.add(buttons[i]);
        
                ButtonGroup group6 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "6")
          group6.add(buttons[i]);
        
                ButtonGroup group7 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "7")
          group7.add(buttons[i]);
        
                ButtonGroup group8 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "8")
          group8.add(buttons[i]);
        
                ButtonGroup group9 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "9")
          group9.add(buttons[i]);
        
                ButtonGroup group10 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "10")
          group10.add(buttons[i]);
        
                ButtonGroup group11 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "11")
          group11.add(buttons[i]);
        
                ButtonGroup group12 = new ButtonGroup();
        for(int i = 0; i < 55; i++)
          if(buttons[i].getText() == "12")
          group12.add(buttons[i]);

       
        

    }
    
   public void setButtonColors(int [] integers, JButton[] buttons) 
   {
      Color[] colors = new Color[12];
      colors[0] = Color.black;
      colors[1] = Color.red;
      colors[2] = Color.LIGHT_GRAY;
      colors[3] = Color.blue;
      colors[4] = Color.yellow;
      colors[5] = Color.green;
      colors[6] = Color.pink;
      colors[7] = Color.cyan;
      colors[8] = Color.orange;
      colors[9] = Color.magenta;
      colors[10] = Color.white;
      colors[11] = Color.DARK_GRAY;
      
      int colorIndex = 0;
      
      for(int i = 0; i < 55; i++)
        buttons[i] = new JButton(String.valueOf(integers[i])); 

      for(int i = 0; i < 55; i++)
      {
        for(int j = i; j < 55; j++)
        {
          if((buttons[i].getText() == buttons[j].getText()) && (buttons[j].isEnabled()))
          {
            System.out.println("works");
            buttons[j].setBackground(colors[integers[colorIndex]-1]);
            buttons[j].setEnabled(false);
            colorIndex++;
          } 
      } 

      }
      
   }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method is invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        GridLayoutDemo frame = new GridLayoutDemo("GridLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}