


import java.awt.*;
import java.util.HashMap;
import java.util.Hashtable;
import javax.swing.JPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhaskar
 */
public class mypanel extends JPanel {
    
    
    public static String[] finalPath ;
    public static double finalDistance ;
    public static int finalPathLength;
    public static int identifier=0;
    public static Hashtable<String,String> hashtable = new Hashtable<String,String>();
    
    
    public mypanel()
    {       //setting the background ..
            setBackground(Color.white);
            
    }
    
    
    public void paint(Graphics g)
    {
        super.paint(g);
       //drawing the graph .. 
       // drawGraph(g);
        //drawing the graph ..
        
        //g.setColor(Color.white);
        //Graphics2D g2 = (Graphics2D)g;
       
     System.out.println("hello\n");
        
        //draw strings of names ..
        g.drawString("Punjab University", 20, 40);
        g.drawString("PEC", 210, 30);
        g.drawString("Rock Garden", 610, 50);
        g.drawString("Sukhna Lake", 810,290 );
        g.drawString("ISBT Sector 17", 340, 420);
        g.drawString("PGI", 260, 150);
        g.drawString("ISBT Sector 43", 60, 300);
        g.drawString("J W Marriot", 70, 610);
        g.drawString("Satsang Bhawan",250, 660);
        g.drawString("IT Park", 850, 600); 
        
        //draw circles at each position of names ..
        
       g.setColor(Color.red);
        g.fillOval(35,45,10,10);
        g.fillOval(205,35,10,10);
        g.fillOval(605,55,10,10);
        g.fillOval(245,145,10,10);
        g.fillOval(45,295,10,10);
        g.fillOval(295,405,10,10);
        g.fillOval(795,285,10,10);
        g.fillOval(45,605,10,10);
        g.fillOval(245,645,10,10);
        g.fillOval(835,595,10,10);
        
        
        //drawing respective edges ..
       
        g.setColor(Color.black);
        
        g.drawLine(40,50,210,40 );
        g.drawLine(40,50,50,300 );
        g.drawLine(40,50,250,150 );
        g.drawLine(210,40,250,150 );
        g.drawLine(210,40,610,60 );
        g.drawLine(250,150,300,410);
        g.drawLine(50,300,300,410);
        g.drawLine(50,300,50,610);
        g.drawLine(50,610,300,410);
        g.drawLine(50,610,250,650);
        g.drawLine(250,650,300,410);
        g.drawLine(250,650,840,600);
        g.drawLine(840,600,800,290);
        g.drawLine(840,600,300,410);
        g.drawLine(800,290,300,410);
        g.drawLine(800,290,610,60);
        
        
    }
    
    
}
