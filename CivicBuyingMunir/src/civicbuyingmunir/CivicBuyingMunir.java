/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civicbuyingmunir;

  import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class CivicBuyingMunir extends JFrame
                      implements ActionListener
{private JRadioButton lx, sport, ex,red,blue,black; 
  private JButton order;
  
  private JCheckBox heatedseat, rgb,gps ;
  
  
  private static final String MY_PASSWORD = "0";
  private Cars[] module;

  public CivicBuyingMunir()
  {
      
    super("Honda Civic Cars");
    
    
    //--------------------------------------- --------------------------------------- 
    CompoundBorder border = new CompoundBorder(
        new EmptyBorder(1, 2, 1, 2),     // 6 pixels on top, left, bottom, right
        new LineBorder(Color.black, 1));
    lx = new JRadioButton("lx+ $100");
    sport = new JRadioButton("sport+ $400");
    ex = new JRadioButton("ex +$200", true);
    
    ButtonGroup gr = new ButtonGroup();
    gr.add(lx);
    gr.add(sport);
    gr.add(ex);
    
    JPanel sizes  = new JPanel();
    sizes.setBorder(border);
    sizes.setLayout(new GridLayout(3, 1, 5, 5));
    sizes.add(lx);
    sizes.add(sport);
    sizes.add(ex);
    
    
    
    
   
   
    
    Box hbox = Box.createHorizontalBox();
    hbox.add(Box.createHorizontalStrut(5));
    hbox.add(sizes);
    hbox.add(Box.createHorizontalStrut(5));
    
    hbox.add(Box.createHorizontalStrut(5));
   
    Box vbox = Box.createVerticalBox();
    vbox.add(Box.createVerticalStrut(5));
    
   
    
    Container a = getContentPane();
    a.setLayout(new GridLayout(1,10, 10,10));
    a.add(hbox, BorderLayout.NORTH);
      a.add(hbox, BorderLayout.CENTER);
    a.add(vbox, BorderLayout.WEST);
    
    ///////////////////////////////////////////----------------------------------
    //colors-----------------------------------------------------------------------------------
    
    red = new JRadioButton("red+ $100");
    blue = new JRadioButton("blue+$100");
    black = new JRadioButton("black+ $200", true);
    
    ButtonGroup ss = new ButtonGroup();
    ss.add(red);
    ss.add(blue);
    ss.add(black);
    
    JPanel s  = new JPanel();
    s.setBorder(border);
    s.setLayout(new GridLayout(3, 4, 10, 10));
    s.add(red);
    s.add(blue);
    s.add(black);
   
    hbox.add(s);
    
    
    
   
    /////-----------------------------------------------------------------------------------------
    //ACESSORIRES_________________________________________________________________________________
    
    heatedseat = new JCheckBox("heated seat+ $10");
    rgb = new JCheckBox("rbg+ 200");
    gps = new JCheckBox("gps+ $100");

    ButtonGroup accc = new ButtonGroup();
    accc.add(red);
    accc.add(blue);
    accc.add(black);
    
    JPanel acc  = new JPanel();
    acc.setBorder(border);
    acc.setLayout(new GridLayout(3, 1, 10, 10));
    acc.add(heatedseat);
    acc.add(rgb);
    acc.add(gps);
    
    
    hbox.add(acc);
    
    
    
    
    
    
    ///_______________________----------------------------------------------------------------------
    // Load the coin icon for the vending machine buttons:
    ImageIcon coin = new ImageIcon("coin.gif");

    Color brandColor1 = new Color(130, 30, 10); // r, g, b
   
/// right side
    Cars[] machines =
    {
      new Cars("Cars", brandColor1, 0, coin)
      
    };
    this.module = machines;
    
    int w = machines.length * (400+10);
    int h = 310;
    setMinimumSize(new Dimension(w, h));

    Box wall = Box.createHorizontalBox();
    wall.add(Box.createHorizontalStrut(5));
    for (Cars machine : machines)
    {
      wall.add(machine);
      wall.add(Box.createHorizontalStrut(5));
    }

    JPanel service = new JPanel();
   

    Container c = getContentPane();
    
    
   //the black in mid
    
    c.add(wall, BorderLayout.CENTER);
    //---------------
  }

  /**
   * Password field: user strikes <Enter>
   */
  public void actionPerformed(ActionEvent e)
  {
    JPasswordField password = (JPasswordField)e.getSource();
    String word = new String(password.getPassword());
    password.setText("");
    if (MY_PASSWORD.equals(word))
    {
      // Added for Section 10.12 Lab:
      double amt = Vendor.getTotalSales();

      for (Cars machine : module)
        machine.reload();
        
      JOptionPane.showMessageDialog(null,
        // Added for Section 10.12 Lab:
        String.format("Total sales: $%.2f\n", amt) + 
        "Machines reloaded",
        "Service", JOptionPane.INFORMATION_MESSAGE);
    }
    else
    {
      JOptionPane.showMessageDialog(null,
        "Login failed", "Service", JOptionPane.ERROR_MESSAGE);
    }
  }

  // *****************************************************

  public static void main(String[] args)
  {
    CivicBuyingMunir window = new CivicBuyingMunir();
    window.setSize(1500, 100);
    window.setLocation(50, 50);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}