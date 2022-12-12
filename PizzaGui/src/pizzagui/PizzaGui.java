/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzagui;

/**
 *
 * @author kmunir
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.Box;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class PizzaGui extends JFrame implements ActionListener
{
  private JRadioButton small, medium, large; 
  private JButton order;
  private JToggleButton toGo;
  private JCheckBox cheese, mushrooms, pepperoni;
  private ArrayList<String> top;
  private JTextField display;
    
    
  public PizzaGui()
  {
    CompoundBorder border = new CompoundBorder(
        new EmptyBorder(6, 6, 6, 6),     // 6 pixels on top, left, bottom, right
        new LineBorder(Color.black, 1)); // outside, 1 pixel thick

    
    small = new JRadioButton("Small");
    medium = new JRadioButton("Medium");
    large = new JRadioButton("Large", true);

    ButtonGroup gr = new ButtonGroup();
    gr.add(small);
    gr.add(medium);
    gr.add(large);
    
    
    
    
    

    JPanel sizes  = new JPanel();
    sizes.setBorder(border);
    sizes.setLayout(new GridLayout(3, 1, 10, 10));
    sizes.add(small);
    sizes.add(medium);
    sizes.add(large);

    cheese = new JCheckBox("Extra cheese");
    mushrooms = new JCheckBox("Mushrooms");
    pepperoni = new JCheckBox("Pepperoni");

    JPanel toppings  = new JPanel();
    toppings.setBorder(border);
    toppings.setLayout(new GridLayout(3, 1, 10, 10));
    toppings.add(cheese);
    toppings.add(mushrooms);
    toppings.add(pepperoni);
    
    order = new JButton("Order");
    toGo = new JToggleButton("To go", false);
    
    order.addActionListener(this);
    
    display = new JTextField(10);
    display.setBackground(Color.yellow);
    display.setEditable(false);
    
    JPanel disp = new JPanel();
    disp.setBorder(border);
    disp.setLayout(new GridLayout(1,2,10,10));
    disp.add(display);
    
    
    JPanel buttons = new JPanel();
    buttons.setBorder(border);
    buttons.setLayout(new GridLayout(3,1,10,10));
    buttons.add(toGo);
    buttons.add(order);
    
    
   
    

    Box hbox = Box.createHorizontalBox();
    hbox.add(Box.createHorizontalStrut(10));
    hbox.add(sizes);
    hbox.add(Box.createHorizontalStrut(10));
    hbox.add(toppings);
    hbox.add(Box.createHorizontalStrut(10));
    hbox.add(buttons);
    hbox.add(Box.createHorizontalStrut(10));
   
    Box vbox = Box.createVerticalBox();
    vbox.add(Box.createVerticalStrut(5));
    vbox.add(disp);
    
  
    
    
    

    Container c = getContentPane();
    c.setLayout(new GridLayout(2,1, 10,10));
    c.add(hbox, BorderLayout.NORTH);
    c.add(vbox, BorderLayout.CENTER);
    
  }
  
   public void actionPerformed(ActionEvent e)
   {
       JButton click = (JButton)e.getSource();
       String size = "";
       top = new ArrayList<>();
       
       
       if(small.isSelected())
       {
           size = "small";
           
       }
       else if(medium.isSelected())
       {
           size= "medium";
       }
       else 
       {
           size = "large";
       }
       
       if(cheese.isSelected())
           top.add("extra cheese");
       if(mushrooms.isSelected())
           top.add("mushrooms");
       if(pepperoni.isSelected())
           top.add("pepperoni");
       
       String tops = "";
       
       for(String t : top)
           tops = tops + t + " ";
       
       String pizza = "You ordered a " + size + " pizza with " + tops;       
       
       if(click == order)
       {
           display.setText("small");
           JOptionPane.showMessageDialog(PizzaGui.this, pizza);
       }
       
      
   }

  public static void main(String[] args)
  {
    PizzaGui window = new PizzaGui();
    window.setSize(500, 500);
    window.setBounds(100, 100, 350, 300);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true);
    
  }
}


   