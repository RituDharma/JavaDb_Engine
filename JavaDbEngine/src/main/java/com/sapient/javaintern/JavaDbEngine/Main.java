package com.sapient.javaintern.JavaDbEngine;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		String str="select winner,season, id from ipl.csv where season > 2014";
		  QueryExtract rd= new QueryExtract();
		  rd.getToken();
		  ArrayList<String> list1=rd.getFile(str);
		  System.out.println("File name: "+list1);
		  String str1=rd.getBase(str);
		  System.out.println("Base Part: "+str1);
		  String str2=rd.getLast(str);
		  System.out.println("Last Part: "+str2);
		  String mid=rd.getConditions(str);
		  System.out.println("Conditions: "+mid);
		  String []opt=rd.getOperators(str);
		  ArrayList<String> list2=rd.getAggregate(str);
		  System.out.println("Aggregate Functions: ");
		  String filename = "ipl.csv";
		  String[] field=rd.getFields(str);
 		  for(int i=0;i<field.length;i++)
     		  System.out.println("Fields: "+field[i]);
//creating an array of list	  
		    ArrayList<String> list[] = new ArrayList[18];
		    for(int i=0;i<18;i++)
		    {
		    	list[i]=new ArrayList<String>();
		    }
//reading file    
			FileReader fileread=null;
			BufferedReader br=null;
			String head=" "; 
			String value=" ";
			StringTokenizer st;
			
			try {
		            fileread=new FileReader(filename);
		            br=new BufferedReader(fileread);
					String CurrentLine=" ";
//reads the first line of the file		
					head= br.readLine();
//reads the whole file			
				    while ((CurrentLine = br.readLine()) != null) {
				    	value+=CurrentLine;
				    	st = new StringTokenizer(CurrentLine, ",");
				    	int curr=0;
				    	while(st.hasMoreTokens())
				    	{
				    		list[curr++].add(st.nextToken());
				    	}
				    }
//creating object of classes and passing values				    
				    DataType data=new DataType();
			    	data.getDataType(head,value);
			        QueryParse qp= new QueryParse();
			        qp.getData(head,list,field,mid);
				    	

				} catch (IOException e) {
					e.printStackTrace();
				}
			    finally {
			    	if(br!=null) {
			    		try {
			    			br.close();
			  	    		}catch(IOException e){
			  	    			e.printStackTrace();			
			  	    		}
			    	}
			    	if(fileread!=null)
			    	{
			    		try {
			    			fileread.close();
			    		}catch(IOException e) {
			    			e.printStackTrace();
			    		}
			    	}
			    }
			
			}

	}
