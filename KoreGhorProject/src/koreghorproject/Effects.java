package koreghorproject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import koreghorproject.util.Dashbord;
import koreghorproject.util.HomePage;
import koreghorproject.util.MenuCard;

public class Effects {

    public void count() {
        Dashbord ds = new Dashbord();
        ds.setVisible(true);
        for (int i = 1; i <= 100; i++) {
            
            try {
                Thread.sleep(40);
                ds.bar.setValue(i);
                ds.ibl.setText(Integer.toString(i) + "%");
                
                
                //MenuCard mn = new MenuCard();
                HomePage home= new HomePage();
                if (i == 100) {
                    ds.dispose();
                    home.show();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Dashbord.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    
    
    public void showDateAndTime(){
    MenuCard mn= new MenuCard();
        Date d =new Date();
        SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyyy");
        String dat = df.format(d);
        //mn.shDate.setText(dat);
    
    
    
    }
    
    
    
    
    

}
