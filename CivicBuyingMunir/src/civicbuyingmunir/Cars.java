/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civicbuyingmunir;




import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Cars extends JPanel
                            implements ActionListener
{
  
  
  private static final int FULL_STOCK = 5;
  private JButton lX, Sport, EX, go,red,blue,black;
  private JTextField display;
  private Vendor vendor;
  boolean trayFull;
  Color brandColor;
  String brandName;

  public Cars(String brand, Color color, int price, ImageIcon coin)
  {
    setBackground(Color.WHITE);
    brandColor = color;
    brandName = brand;

    JTextField banner = new JTextField("  " + brandName +
                                       "  " );
    banner.setEditable(false);
    banner.setFont(new Font("Serif", Font.BOLD, 14));
    banner.setHorizontalAlignment(JTextField.CENTER);

    
    
    
   
    go = new JButton("Buy");
    go.setBackground(Color.PINK);
    go.addActionListener(this);
    JPanel buttons = new JPanel(new GridLayout(3, 1, 5, 0));
    buttons.setBackground(Color.BLUE);
   

    display = new JTextField("0");
    display.setFont(new Font("Monospaced", Font.BOLD, 16));
    display.setBackground(Color.BLUE);
    display.setEditable(false);
    display.setHorizontalAlignment(JTextField.RIGHT);

    Box b1 = Box.createVerticalBox();
    b1.add(banner);
    b1.add(Box.createVerticalStrut(5));
    b1.add(display);
    b1.add(Box.createVerticalStrut(12));
    Box b2 = Box.createHorizontalBox();
    b2.add(Box.createHorizontalStrut(60));
    Box b3 = Box.createVerticalBox();
    b3.add(go);
    b3.add(Box.createVerticalStrut(8));
    b3.add(buttons);
    b2.add(b3);
    b1.add(b2);
    b1.add(Box.createVerticalStrut(5));
    add(b1);

    vendor = new Vendor(price, FULL_STOCK);
  }

  public void reload()
  {
    vendor.setStock(FULL_STOCK);
    display.setText(" " + vendor.getDeposit() + "  ");
    repaint();
  }

  public void actionPerformed(ActionEvent e)
  {
    JButton b = (JButton)e.getSource();

    if (b == lX)
      vendor.addMoney(100);
    else if (b == Sport)
      vendor.addMoney(1000);
    else if (b == EX)
      vendor.addMoney(2500);
    else if (b == go)
    {
      trayFull = vendor.makeSale();
      int change = vendor.getChange();
      if (trayFull)          // Successful sale
      {
        repaint();
        JOptionPane.showMessageDialog(null,
          "Enjoy your " + brandName + "\n" + " Change $ " + change + "",
          "Enjoy " + brandName, JOptionPane.PLAIN_MESSAGE);
        trayFull = false;
      }
      else if (change > 0)   // Refund
      {
        JOptionPane.showMessageDialog(null,
          "Take $" + change + "back",
          "Money back", JOptionPane.ERROR_MESSAGE);
      }
    }

    if (vendor.getStock() > 0)
      display.setText(" " + vendor.getDeposit() + "  ");
    else
      display.setText("Call service ");

    repaint();
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    final int x0 = getWidth() / 12;
    final int y0 = getHeight() / 2;
    final int yStep = 14;
///stock graphic/////////////////////////////////////////
    g.setColor(Color.WHITE);
    g.drawRect(x0, y0, 28, FULL_STOCK * yStep + 4);

    int y = y0 + 4, x = x0 + 4;
    int stock = vendor.getStock();
    int count = FULL_STOCK;
/////////////////////////////////////////
  
  }

 
}

