/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oorestaurant;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class superclass {
    
    public double chickenburger;
    public double chickenpizza;
    public double vegpizza;
    
    public double choclate;
    public double vanilla;
    public double pineapple;
    
    public double snacks;
    public double milkshakes;
    public double TotalofSNM;
    public double AllTotalofSNM;
    
    public double getAmount()
    
    {
        snacks = chickenburger + chickenpizza + vegpizza;
        milkshakes=choclate+vanilla+pineapple;
        
        TotalofSNM = snacks+ milkshakes;
        AllTotalofSNM = TotalofSNM;
        return AllTotalofSNM ;
        
    }
    
    private JFrame frame;
  
     public void iExitSystem(){
       frame = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","java restaurantmanagementsystem",JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
       System.exit(0);
       }
     }
    public double pchickenburger =20;
    public double pchickenpizza = 40;
    public double pvegpizza = 40;
    
    public double pchoclate = 30;
    public double pvanilla = 20;
    public double ppineapple = 15;
    
    
    public double mctax = 0.911;
    
   public Double cFindTax (double cAmount){
         double FindTax = cAmount-(cAmount*mctax);
         return FindTax;
   }
} 
