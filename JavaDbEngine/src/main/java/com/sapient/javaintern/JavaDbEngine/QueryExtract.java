package com.sapient.javaintern.JavaDbEngine;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class QueryExtract {
//initializing variables and array list 	
	 String str1="select season,winner,id from ipl.csv where season > 2014 and city = 'Bangalore'";
	 String str2="select * from ipl.csv where season > 2016 and city= 'Bangalore' order by win_by_runs ";
	 String str3="select avg(win_by_wickets) , min(win_by_runs) from ipl.csv ";
	 String s1=" ";
	 String s2="where";
	 String lastpart=" ";
	 int len=s2.length()+1;
	 ArrayList<String> list1= new ArrayList<String>();
	 ArrayList<String> list2= new ArrayList<String>();
	 ArrayList<String> list3= new ArrayList<String>();
	 ArrayList<String> list4= new ArrayList<String>();	
	 String opt[]= {"and","or","not","xor"};
	 int index=str1.indexOf("where");
//creating tokens
	  void getToken(){ 
		 //String s[]=null;
		 int i=0;
		  StringTokenizer st= new StringTokenizer(str1);
		  while(st.hasMoreTokens())
		    {
			  s1=st.nextToken();
			//  s[i++]=s1;
	          System.out.println("Tokenized: "+s1);
		    }
		//return s;
	  }
//Extracting file name	 
	  ArrayList<String> getFile(String str)
	  {
		  StringTokenizer st= new StringTokenizer(str1);
		  while(st.hasMoreTokens())
		    {
			  s1=st.nextToken();
	 //extracting file name        
	          if(s1.contains("."))
	          { 	  
	        	 list1.add(s1);
	          }       	         
	        }
		 //System.out.println("File Name: "+list1);
		  return (list1);
	  }
//extracting fields	  
	  String[] getFields(String str)
	  {
          int index=str1.indexOf("from");
          String substr=str1.substring(0,index);
          String[] substr1=substr.split("[ ,]");
          String s=" ";
          for(int i=1; i<substr1.length;i++)
          {
        	  s=substr1[i];
          }
		return substr1;
	  }
//extracting base part of query	  
	  void getBase() {
		  System.out.println("Base part: "+str1.substring(0,index));
	      
	  }
//extracting last part of query	  
	  void getLast() {
          lastpart=str1.substring(index+len,str1.length());
		  System.out.println("Last past: "+str1.substring(index+len,str1.length()));
	  }
//extracting conditions	  
	  void getConditions() {
		  /*String arr1[] = str1.split("and");
		  String arr2[] =arr1[0].split("where");
		  System.out.println("Condition 1 :" + arr1[1]);
		  System.out.println("Condition 2 :" + arr2[1]);*/
		  if(lastpart!=null)
		  {
			  String last[]=lastpart.split(" ");
			  int pev=0;
			  String mid=" ";
			  for(int i=0;i<last.length;i++)
			  {
				  if(last[i].equals("and")||last[i].equals("not")||last[i].equals("or")||last[i].equals("xor"))
				  {
					for(int j=pev;j<i;j++)
					{
						mid=mid+last[j]+" ";
					}
					pev=i+1;
				  }		
			  }
			  for(int j=pev;j<last.length;j++)
				{
					mid=mid+last[j]+" ";
				}
			  System.out.println("Conditions: "+mid);
		}
	  }
//extracting logical operators	  
	  void getOprators() {
		  String arr3[]=str2.split(" ");
			for(int i=0;i<arr3.length;i++)
			{
		//logical operators		
				if(arr3[i].equals("and")||arr3[i].equals("or")||arr3[i].equals("not")||arr3[i].equals("xor"))
				{
					System.out.println("Logical Operators: "+arr3[i]);
				}	
		//order by		
				if(arr3[i].equals("order"))
				{
					System.out.println("Orderby: "+arr3[i+2]);
				}
			}
	  }
//extracting aggregate  functions	  
	  void getAggregate() {
		  StringTokenizer st2= new StringTokenizer(str3);
			String s4=" ";
			while(st2.hasMoreTokens())
			{
			  s4=st2.nextToken();
			  if(s4.contains("avg")||s4.contains("min")||s4.contains("max")||s4.contains("count"))
			  {
				  list4.add(s4);
			  }
			}
			System.out.println("Aggregate functions: "+list4);
	   }
 
}
