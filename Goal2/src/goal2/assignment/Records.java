package goal2.assignment;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Records {

	  String str1="select season,winner,player_match from ipl.csv where season > 2014 and city = 'Bangalore'";
	  String str2="select * from ipl.csv where season > 2016 and city= 'Bangalore' order by win_by_runs ";
	  String str3="select avg(win_by_wickets) , min(win_by_runs) from ipl.csv ";
	  String s1=" ";
	  String s2="where";
	  int len=s2.length()+1;
	  ArrayList<String> list1= new ArrayList<>();
	  ArrayList<String> list2= new ArrayList<>();
	  ArrayList<String> list3= new ArrayList<>();
	  ArrayList<String> list4= new ArrayList<>();	
	  String opt[]= {"and","or","not","xor"};
	  int index=str1.indexOf("where");
	  void getToken(){
		  
		  StringTokenizer st= new StringTokenizer(str1);
		  while(st.hasMoreTokens())
		    {
			  s1=st.nextToken();
	          System.out.println("Tokenized: "+s1);
		    }
	  }
	  void getFile()
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
		 System.out.println("File Name: "+list1);
	  }
	  void getFileds()
	  {
		  StringTokenizer st= new StringTokenizer(str1);
		  while(st.hasMoreTokens())
		    {
			  s1=st.nextToken();
			  if(s1.contains(","))
	          {
	        	  list2.add(s1);
	          }
		    }
		  System.out.println("Fields: "+list2);

	  }
	  void getBase() {
		  System.out.println("Base part: "+str1.substring(0,index));
	      
	  }
	  void getLast() {
		  System.out.println("Last past: "+str1.substring(index+len,str1.length()));
	  }
	  void getConditions() {
		  String arr1[] = str1.split("and");
		  String arr2[] =arr1[0].split("where");
		  System.out.println("Condition 1 :" + arr1[1]);
		  System.out.println("Condition 2 :" + arr2[1]);
	  }
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
	  
