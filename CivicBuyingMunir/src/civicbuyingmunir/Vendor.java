/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civicbuyingmunir;

/**
 *
 * @author kmunir
 */
public class Vendor
{
  // Fields:
 private int price, stock, deposit, change;
 private static double totalSales;


   public Vendor(int p, int s)
  {
    price = p;
    stock = s;
  }

  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int qty)
  {
    stock = qty;
  }

  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
  public int getStock() 
  {
    return stock;
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney(int cents)
  {
    deposit += cents;
  }

  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit()
  {
    return deposit;
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock and
   * calculates and sets change, sets deposit to 0 and
   * returns true; otherwise refunds the whole deposit
   * (moves it into change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
  public boolean makeSale()
  {
    if(stock > 0 && deposit >= price)
    {
        stock--;
        change = deposit - price;
        deposit = 0;
        totalSales += 0.01 * price;
        return true;
    }
    else
    {
        change = deposit;
        deposit = 0;
        return false;
    }
        
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */
  public int getChange()
  {
    return change;
  }
  
  public static double getTotalSales()
  {
      double temp = totalSales;
      totalSales = 0;
      return temp;
  }
  
  
}