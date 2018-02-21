package com.sapient.javaintern.JavaDbEngine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DataType {
	public void getDataType(String heading, String rowvalues) {
		//System.out.println("Heading: "+heading);
		//System.out.println("Value of each row: "+rowvalues);
		String rowval[]=rowvalues.split(",");
		HashMap<String,String> hmap= new HashMap<String,String>();
  //logic for datatype	
		for(String val:rowval)
		{ 
		 try {
			      
		      //checking for integer    	
		            	   Integer.parseInt(val);
		 	               hmap.put(val,"Interger");
		          
		    }
	        catch (NumberFormatException e)  //exception if integer not found
	        {
	    //checking for string  // System.out.println(val + " is String");
	            hmap.put(val,"String");
	        }
		 try
	        {  
			 String str1 = null;
             DateFormat formatter = null;
             Date str2 = null;
 		     if (val.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) {
                formatter = new SimpleDateFormat("dd/MM/yyyy");
             } else if (val.matches("([0-9]{2})-([0-9]{2})-([0-9]{4})")) {
                formatter = new SimpleDateFormat("dd-MM-yyyy");
             } else if (val.matches("([0-9]{4})([0-9]{2})([0-9]{2})")) {
                formatter = new SimpleDateFormat("yyyyMMdd");
             } else if (val.matches("([0-9]{4})-([0-9]{2})-([0-9]{2})")) {
                formatter = new SimpleDateFormat("yyyy-MM-dd");
             } else if (val.matches("([0-9]{4})/([0-9]{2})/([0-9]{2})")) {
                formatter = new SimpleDateFormat("yyyy/MM/dd");
             }
 		    
	               //System.out.println(val + " is a valid integer number");
             
	     //checking for date	    
 		    str2=formatter.parse(val);
 		    hmap.put(val,"date");
	        } 
			 catch (Exception ex) {    //Catch the Exception if date not found
				//hmap.put(val,"String");
				 
	         }
		 }
	//printing values	
		for(Map.Entry<String, String> hm : hmap.entrySet())
		{
			System.out.println(hm.getKey()+"--->"+hm.getValue());
		}   
	 }
}
