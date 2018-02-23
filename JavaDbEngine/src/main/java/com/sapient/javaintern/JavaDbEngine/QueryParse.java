package com.sapient.javaintern.JavaDbEngine;
import java.util.*;
public class QueryParse {
	public void getData(String head, ArrayList<String>[] list,String field[],String con) {
		String str="select season,id from ipl.csv";
		String str1="select season,id,date,team1 from ipl.csv where season>2014";		
		 StringTokenizer st= new StringTokenizer(str1);
		 //StringTokenizer st1= new StringTokenizer(head);
		 String heads[]=head.split(",");
		 int c=0;
		 //System.out.println(list[0].get(15));
		  for(int j=1;j<field.length;j++)
		   {  
			   if(field[j].equals("*"))
			   {
				   //printing column wise data 	
					for(ArrayList ele : list){
				        System.out.println(ele+"  ");
				    }
			   }
			   for(int i=0;i<heads.length;i++)
			   {
				   if(heads[i].equals(field[j]))
				   {
					   System.out.println(list[i]);
				   }
			   }
			 //test case k karn yh sb kuch print nhi kr rha h   
			 }
		  System.out.println(head);
		  int index=0;
		  String opt=" ";
		  StringTokenizer st1= new StringTokenizer(con);
		  String condt[]=con.split(" ");
		  for(int j=0;j<condt.length;j++)
			  System.out.println(condt[j]);
			  
		  for(int j=0;j<condt.length;j++)
		  for(int i=0;i<heads.length;i++)
		  {
			  if(heads[i].equals(condt[j])) 
			  {
				   index=i;
				  // System.out.println(list[i]);
			  }
			  
			  if(condt[j].equals(">")) {
				  opt=condt[j];
			  }
	
		  }   
		 // for(int i=0;i<list.length;i++)
			  
			  //if((list[index])>"2014"))
				   System.out.println(list[index]);
		  
		  
	}	   
		  
	}
	


