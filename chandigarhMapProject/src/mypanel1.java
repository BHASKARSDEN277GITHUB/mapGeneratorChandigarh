


import java.awt.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class mypanel1 extends JPanel {
    
    
    public static String[] finalPath ;
    public static double finalDistance ;
    public static int finalPathLength;
    public static int identifier=0;
    public static final Hashtable<String,String> hashtable = new Hashtable<String,String>(){ {
        put("Sukhna Lake","800,290");
        put("Rock Garden","610,60");
        put("IT Park","840,600");
        put("PEC","210,40");
        put("Punjab University","40,50");
        put("ISBT Sector 43","50,300");
        put("ISBT Sector 17","300,410");
        put("J W Marriot","50,610");
        put("Satsang Bhawan","250,650");
        put("PGI","250,150");}};
    
    
    
    public mypanel1(String[] path,int finalPathLength,double distance,int identifier)
    {
        this.finalPath=path;
        this.finalPathLength=finalPathLength;
        this.finalDistance=distance;
        this.identifier=identifier;
        
        setBackground(Color.white);
        System.out.println("hello\n");
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        
        System.out.println("hello\n");
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
        
       
        
        
         // set hashMap first using class function setHashmap() ..
        //setHashMap();
        
       
      //  System.out.println("hello h ello ehlooo");
        
        
        for(int i=0;i<finalPathLength-1;i++)
        {
            if(hashtable.get(finalPath[i])!=null &&hashtable.get(finalPath[i+1])!=null  )
            {String coordinates=hashtable.get(finalPath[i]);
            String coordinates1=hashtable.get(finalPath[i+1]);
            System.out.print("lol \n");
            String[] xy=coordinates.split(",");
            int x = Integer.parseInt(xy[0].toString());
            int y=Integer.parseInt(xy[1].toString());
            
            String[] xy1=coordinates1.split(",");
            int x1 = Integer.parseInt(xy1[0].toString());
            int y1=Integer.parseInt(xy1[1].toString());
            
            g.setColor(Color.magenta);
            g.drawLine(x,y,x1,y1);
            
            if(i==0)
            {
                g.setColor(Color.blue);
                g.fillOval(x-5,y-5,10,10);
            }
            if(i+1==finalPathLength-1)
            {
                g.setColor(Color.blue);
                g.fillOval(x1-5, y1-5, 10, 10);
            }
            
        
        
       // hashtable.clear();
        }
        }
    }
    
    
    
    
   /*
    public void setHashMap()
    {
        //hashtable.clear();
        
        
        hashtable.put("Sukhna Lake","800,290");
        hashtable.put("Rock Garden","610,60");
        hashtable.put("IT Park","840,600");
        hashtable.put("PEC","210,40");
        hashtable.put("Punjab University","40,50");
        hashtable.put("ISBT Sector 43","50,300");
        hashtable.put("ISBT Sector 17","300,410");
        hashtable.put("J W Marriot","50,610");
        hashtable.put("Satsang Bhawan","250,650");
        hashtable.put("PGI","250,150");
        
    }*/
    
   
}
