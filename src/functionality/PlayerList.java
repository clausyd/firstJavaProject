package functionality;

import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import player.Player;

@SuppressWarnings("serial")
public class PlayerList implements Serializable{

	private   ArrayList<Player>regList;
	
	
		public PlayerList() 
		{
		    regList = new ArrayList<Player>();
		    regList.trimToSize();
		}
		
		
	
		public boolean addPlayer(Player playerIn)
		{  
			String pps = playerIn.getPpsNum();
			int index = search(pps);
			if(index  == -999)
			{
				regList.add( playerIn);
				return true;
			}else
			{
				return false;
			}
			}
		
		
		 public int search(String ppsIn)
		    {
		        
		        for(int i = 0; i < regList.size(); i++)
		        {
		            
		        	    Player player = regList.get(i);
			            String pps = player.getPpsNum();
		            
		           
		            
		                if(pps.equalsIgnoreCase(ppsIn))
		                {
		                    return i;
		                    
		                }  
		        }
		        
		        return -999;

		    }
		
		
	    public boolean removePlayer(String ppsIn)
	    {
	    	int player = search(ppsIn);
	    	if(player == -999){
	    		
	    	return false;
	    	}
	    	else{
	    		regList.remove(player);
	    		return true;
	    	}
	    	
	    }
		
		
		
		public  String  ListAPlayer(String  ppsIn)
		{
		 for(int i = 0; i < regList.size(); i++)
	        {
	            
	            Player player = regList.get(i);
	            
	            String pps = player.getPpsNum();
	            
	                if(pps.equalsIgnoreCase(ppsIn))
	                {
	                    return player.toString();
	                    
	                }
	        
	        }return "";
		  }
		 
			
	    public  ArrayList<Player> listAllPlayers()
		{  
	    	return regList;
		}
	    
	    public Player updateDetail(String ppsIn)
	    {
	    	 for(int i = 0; i < regList.size(); i++)
		        {
		            
		            Player player = regList.get(i);
		            
		            String pps = player.getPpsNum();
		            
		                if(pps.equalsIgnoreCase(ppsIn))
		                {
		                    return player;
		                    
		                }
		                
		        }return null;
           }
	    
	    public void loadPlayerDataFromFile() {
//				
			try{
				File myFile = new File("data.dat");
				FileInputStream fis = new FileInputStream(myFile); 
				ObjectInputStream ois = new ObjectInputStream(fis);
				regList =(ArrayList<Player>)ois.readObject();
				
			    JOptionPane.showMessageDialog(null,"Read data from file");
			    ois.close();
			    fis.close();
			    
				}catch(IOException e){
					
					JOptionPane.showMessageDialog(null, "File error: "+e.getMessage());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
	    
	    public void savePlayerToFromFile() {
	
			try{
			    File myFile = new File("data.dat");
			    FileOutputStream fos = new FileOutputStream(myFile); 
			    ObjectOutputStream oos = new ObjectOutputStream(fos);
			    oos.writeObject(regList);
			    
			    JOptionPane.showMessageDialog(null,"Data Written to file");
			    oos.close();
			    fos.close();
			    
				}catch(IOException e){
					
					JOptionPane.showMessageDialog(null, "File error: "+e.getMessage());
				}
				}
	    
	    
	   
	
}
		
		
		
		
		
		

