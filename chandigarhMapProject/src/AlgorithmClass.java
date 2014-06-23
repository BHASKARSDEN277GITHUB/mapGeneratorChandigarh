

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhaskar
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import javax.swing.JTextArea;

class Vertex implements Comparable<Vertex>
{
    public final String name;
    public Edge[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY; //great ..
    public Vertex previous;
    public Vertex(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Vertex other)
    {
        return Double.compare(minDistance, other.minDistance);
    }
}

class Edge
{
    public final Vertex target;
    public final double weight;
    public Edge(Vertex argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}

public class AlgorithmClass 
{
    
    public static String startPoint="";
    public static String destinationPoint="";
    public static JTextArea output;
    public static JTextArea algorithm;
    public static String[] finalStringArray ;  //max places we have taken are 10 here .. 
    public static double finalDistance=0;
    public static int finalPathLength=0;
    
    
    public AlgorithmClass(String start , String destination,JTextArea output,JTextArea algorithm)
    {
        this.startPoint=start;
        this.destinationPoint=destination;
        this.output=output;
        this.algorithm=algorithm;
    }
    public static void computePaths(Vertex source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
      	vertexQueue.add(source);
        
        String str = "Exapnding Source (Destination)\n";
        algorithm.update(algorithm.getGraphics());
        
        
	while (!vertexQueue.isEmpty()) {
	    Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies)
            {
                algorithm.append("Exapanding the successor nodes \n");
                algorithm.update(algorithm.getGraphics());
                
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
		if (distanceThroughU < v.minDistance) {
		    vertexQueue.remove(v);
                    algorithm.append("Removing current row from unvisited  \n");
                    algorithm.update(algorithm.getGraphics());
		    v.minDistance = distanceThroughU ;
		    v.previous = u;
                    algorithm.append("Adding Successors to unvisited ");
                    algorithm.update(algorithm.getGraphics());
		    vertexQueue.add(v);
		}
            }
        }
        
        algorithm.append("Done\n ");
        algorithm.update(algorithm.getGraphics());
    }

    public static List<Vertex> getShortestPathTo(Vertex target)
    {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);
        Collections.reverse(path);
        return path;
    }

    
    public static void evaluation()
    {


	//create vertices here ..
	//take an array of vertices ..
	//int linecount=0;
        
         finalStringArray=new String[10];
        
	Vertex v0=new Vertex("Sukhna Lake");
        Vertex v1=new Vertex("Rock Garden");
        Vertex v2=new Vertex("IT Park");
        Vertex v3=new Vertex("PEC");
        Vertex v4=new Vertex("Punjab University");
        Vertex v5=new Vertex("ISBT Sector 43");
        Vertex v6=new Vertex("ISBT Sector 17");
        Vertex v7=new Vertex("J W Marriot");
        Vertex v8=new Vertex("Satsang Bhawan");
        Vertex v9=new Vertex("PGI");
        
        
        
        

	v0.adjacencies = new Edge[]{ new Edge(v1, 4) ,new Edge(v2, 2),new Edge(v6, 7)};
	v1.adjacencies = new Edge[]{ new Edge(v0, 4),new Edge(v6, 5),new Edge(v3, 4) };
	v2.adjacencies = new Edge[]{ new Edge(v0, 2),new Edge(v6, 8),new Edge(v8, 4) };
        v3.adjacencies = new Edge[]{ new Edge(v1, 4),new Edge(v9, 0.5),new Edge(v4, 3)};
	v4.adjacencies = new Edge[]{ new Edge(v3, 3),new Edge(v9, 2),new Edge(v5, 8) };
	v5.adjacencies = new Edge[]{ new Edge(v4, 8),new Edge(v6, 6),new Edge(v7, 4) };
        v6.adjacencies = new Edge[]{ new Edge(v0, 7),new Edge(v1, 5) ,new Edge(v9, 5),new Edge(v5, 6),new Edge(v7, 3),new Edge(v8, 5),new Edge(v2, 8)};
	v7.adjacencies = new Edge[]{ new Edge(v5, 4),new Edge(v6, 3),new Edge(v8, 5) };
	v8.adjacencies = new Edge[]{ new Edge(v6, 5),new Edge(v7, 5),new Edge(v2, 4) };
        v9.adjacencies = new Edge[]{ new Edge(v3, 0.5),new Edge(v4, 2),new Edge(v6, 5) };
	
	
	//,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14

        Vertex[] V =new Vertex[]{v0,v1,v2,v3,v4,v5,v6,v7,v8,v9};

	Vertex vv = v0 ;
	for(Vertex v : V)
        {
                String s = v.name.toString();
                if(s.equals(startPoint))
                {
                    vv=v;
                }
        }
        
        
//set source here and compute all the paths ;) ..
       computePaths(vv);
     
//	print here desired path .. ;)*/
        String finalPath ="";
        String str="";
        for (Vertex v : V)
	{
            String s=v.name;
            if(s.equals(destinationPoint))
            {    
                System.out.println("Distance to "+ ": " + v.minDistance);
                List<Vertex> path = getShortestPathTo(v);
                str=str+"Distance to " + v + ": " + v.minDistance+"\n\n";
                str =str+"Path : "+ path.toString();
                finalPath =path.toString();
                finalDistance=v.minDistance;
        //        String[] split=str.split("]");
            
                System.out.println("Path: " + path);
            
                
            }
            
	}
        output.append(str);
        output.update(output.getGraphics());
        
        
        // start the work for graph here ..
        
        // startPoint , destinationPoint , finalDistance ,finalStringArray, finalPath ,finalPathLength ..
        
        //System.out.println(startPoint+destinationPoint+finalDistance+finalPath);
        
        String[] splitPath=finalPath.split(",");
        finalStringArray[0]=startPoint;
        finalPathLength++;
        
        System.out.println("*************");
        if(splitPath.length>2)
        {
             for(int i =1;i<splitPath.length-1;i++)
             {
                 String removedSpace = splitPath[i].substring(1, splitPath[i].length());//we need to remove the space on first char for comparision purposes here ..
                 //System.out.println(removedSpace);
                 finalStringArray[finalPathLength]=removedSpace;
                 finalPathLength++;
             }
        
        }
        finalStringArray[finalPathLength]=destinationPoint;
        finalPathLength++;
        
        
        for(int i=0;i<finalPathLength;i++)
        {
            System.out.println(finalStringArray[i]);
        }
        
        
        
        //System.out.println(finalPathLength);
        
        
        //create object of algoDemonstration.java class
        
        
        
       algoDemonstration graph = new algoDemonstration();  // a new object created whose parent class extends jframe ..
        
        //create object of mypanel class ..
        int identifier =1;
        mypanel1 panel = new mypanel1(finalStringArray,finalPathLength,finalDistance,identifier);
        
        //set contentPane of graph object ..
        
       graph.setContentPane(panel);
        
        
        //System.out.println("Done"); 
         
         finalPathLength=0;
    }
}


