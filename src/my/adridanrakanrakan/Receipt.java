/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.adridanrakanrakan;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author akifrabbani
 */
public class Receipt {
    
    double totallaici;
    double totalstroberi;
    double totalmango;
    double totalblackcurrant;
    double tax;
    double subtotal;
    double totalprice;
    Calendar timer;
    int saleId;
    int laici;
    int stroberi;
    int mango;
    int blackcurrant;
    
    DecimalFormat df = new DecimalFormat("0.00");
    
    @Override
    public String toString() {
      SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate = new SimpleDateFormat ("dd/mm/yyy");
        Tdate.format(timer.getTime());
        
        return "\n\t Haus Boom Orders \n\n"+
                
                "\n============================================"+
                "\nReference: HB" + String.format("%05d", saleId) + "\t\t\t\t"+
                "\n============================================"+
                "\nLaici       :\t\t\t"+laici+
                "\nStrawberry  :\t\t\t"+stroberi+
                "\nMango       :\t\t\t"+mango+
                "\nBlackcurrant:\t\t\t"+blackcurrant+
                "\n============================================"+
                "\nTax        :\t\t\t"+"RM "+df.format(tax)+
                "\nSub Total  :\t\t\t"+"RM "+df.format(subtotal)+
                "\nTotal Price:\t\t\t"+"RM "+df.format(totalprice)+
                "\n============================================"+
                "\nDate: "+Tdate.format(timer.getTime())+
                "\t\tTime: "+tTime.format(timer.getTime())+
                "\n\n   THANK YOU FOR SHOPPING WITH HAUS BOOM !";
    }
}
