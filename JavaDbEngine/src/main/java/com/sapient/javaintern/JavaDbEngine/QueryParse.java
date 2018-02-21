package com.sapient.javaintern.JavaDbEngine;
import java.util.*;
public class QueryParse {
	public void getData(String head, ArrayList<String>[] list,String field[]) {
		String str="select id from ipl.csv";
		String str1="select  season from ipl.csv";		
		StringTokenizer st= new StringTokenizer(str1);
		String heads[]=head.split(",");
		int c=0;
		//System.out.println(list[0].get(15));
		for(int j=1;j<field.length;j++)
		{  
	       if(field[j].equals("*"))
		   {
	//printing column wise all the data 	
			 for(ArrayList ele : list){
				 System.out.println(ele+"  ");
		     }
		    }
	//for checking the fields and searching the file       
	        for(int i=0;i<heads.length;i++)
		    {
		        if(heads[i].equals(field[j]))
			    {
				    System.out.println(list[i]);
			    }
		    }  
		 }
	 }	   
		  
}
	


