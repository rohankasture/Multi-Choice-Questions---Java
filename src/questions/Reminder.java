/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questions;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/**
 *
 * @author itsankit
 */
public class Reminder {
    Timer timer;
int i=59,j=29;
    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(),0,seconds*1000);   //0 is for initial and then as parameter is millisec,it will be called after 1*1000=1 sec
	}

    

    class RemindTask extends TimerTask {
        
        @Override
        public void run() {
            
           code.jLabel6.setText(" "+ j +" : "+i--);
           if(i==-1)
           {
               i=59;
               j--;
           }
           
        if(i==0 && j==0){
            timer.cancel();
           Final fr1=new Final();
           code fr=new code();
        fr1.dispose();
        fr1.setUndecorated(true);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setSize(1366, 768);
        fr1.setVisible(true);
        fr.setVisible(false);
        fr1.jLabel2.setText(Integer.toString(code.score) );
        
        }
            }
        
        }
//  JOptionPane.showMessageDialog(null, "Please Select a valid option"+ (++i)); 
          //  timer.cancel(); //Terminate the timer thread
           // System.exit(0);
}
    

    
    
