/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.adridanrakanrakan;
import java.text.SimpleDateFormat;
import org.json.simple.JSONObject;
import java.util.Calendar;
import java.sql.Timestamp; 
import java.text.*;

/**
 *
 * @author akifrabbani
 */
public class Sale extends Receipt {

    
    public Sale(double a, double b, double c, double d, double e, double f, double g, Calendar h, int j, int k, int l, int m, CreateImportClass create) {

        totallaici = a;
        totalstroberi = b;
        totalmango = c;
        totalblackcurrant = d;
        tax = e;
        subtotal = f;
        totalprice = g;
        timer = h;
       
        laici = j;
        stroberi = k;
        mango = l;
        blackcurrant = m;
        
        saleId = create.addSale(totallaici, totalstroberi, totalmango, totalblackcurrant, tax, subtotal, totalprice, timer, laici, stroberi, mango, blackcurrant);
    }
    
    public Sale() {
        
    }
    
    public boolean find(JSONObject sales, String x) {
        String id = x.replace("HB", "");
        String strPattern = "^0+(?!$)";        
        id = id.replaceAll(strPattern, "");
        
        int finalId = Integer.parseInt(id);
        
        return this.find(sales, finalId);
    }
    
    public boolean find(JSONObject sales, int id) {
        boolean found = false;
        
        String yid = String.valueOf(id);
        
        if (sales.containsKey(yid)) {
            JSONObject sale = (JSONObject) sales.get(yid);
            System.out.println(sale);
            
            totallaici = (double) sale.get("total_laici");
            totalstroberi = (double) sale.get("total_stroberi");
            totalmango = (double) sale.get("total_mango");
            totalblackcurrant = (double) sale.get("total_blackcurrant");
            
            tax = (double) sale.get("tax");
            subtotal = (double) sale.get("subtotal");
            totalprice = (double) sale.get("totalprice");

            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(((Long) sale.get("timer")));
           
            timer = calendar;
            
           // timer = ((Long) sale.get("laici")).intValue();

            laici = ((Long) sale.get("laici")).intValue();
            stroberi = ((Long) sale.get("stroberi")).intValue();
            mango = ((Long) sale.get("mango")).intValue();
            blackcurrant = ((Long) sale.get("blackcurrant")).intValue();

            saleId = ((Long) sale.get("id")).intValue();
                
            return true;
        } else {
            System.out.println("haha");
            return false;
        }

    }
    
}
