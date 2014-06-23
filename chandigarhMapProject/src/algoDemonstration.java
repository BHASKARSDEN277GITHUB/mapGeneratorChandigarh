


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhaskar
 */

//creating class and extending JFrame from that class definition ..

public class algoDemonstration extends JFrame {
    private static Graphics2D g;
    
    //constructor ..
    public algoDemonstration()
    {
           
            int frameWidth = 900;
            int frameHeight = 700;
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            this.setBounds((int) screenSize.getWidth() - frameWidth ,0, frameWidth, frameHeight);
            //setting visible true ..
            setVisible(true);
            
                
            //setting size ..
                
            setSize(900,700);
            
            //
            
            //setting Title
            
            setTitle("CHANDIGARH CITY ");
            
            //Setting default close operation ..
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            
            // this.setLocationRelativeTo(null);
                
            
    }
    
}
