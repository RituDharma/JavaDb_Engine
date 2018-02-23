package com.sapient.javaintern.JavaDbEngine;
//package org.Springframework.samples.SpringJDBCMaven;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class AppTest
{  /*QueryExtract qe;
   @BeforeEach
   void beforeEach() {
	   qe= new QueryExtract();
	   qe.getFields(null);
   }*/


/*@Test
public void fieldCheck() {
	String str="select venue and from ipl.csv";
	QueryExtract qe=new QueryExtract();
	String []result1= {"venue","and"};
	assertArrayEquals(result1,qe.getFields(str));
}
@Test
public void fileCheck(){			
	QueryExtract qe=new QueryExtract();
	String str="select venue from ipl.csv where venue = mohali";
	String str1="select venue from ipl.csv";
	ArrayList<String> list=new ArrayList();
	list.add("ipl.csv");
	//System.out.println(list);
	assertTrue(list.equals(qe.getFile(str)));
}
@Test
public void baseCheck() {
	QueryExtract qe=new QueryExtract();
	String str1="select winner,id,city from ipl.csv where season > 2014";
	String obj1="select winner,id,city from ipl.csv ";
	String obj2=qe.getBase(str1);
	System.out.println(obj2);
	//assertTrue(obj1.equals(qe.getBase(str)));
	//main class vali string call kr rha h
}
@Test
public void lastCheck() {
	QueryExtract qe=new QueryExtract();
	String str1="select winner,id,city from ipl.csv where season > 2014";
	String obj1=" season>2014";
	String obj2=qe.getLast(str1);
	System.out.println(obj2);
	assertTrue(obj1.equals(qe.getLast(str1)));
	//index ki prob ho rhi h. output alag de rha h 
}
@Test
public void conditionCheck() {
	QueryExtract qe=new QueryExtract();
	String str1="select winner,id,city from ipl.csv where season > 2014 and city='Banglore'";
	String obj1="and";
	String obj2=qe.getLast(str1);
	System.out.println(obj2);
	assertTrue(obj1.equals(qe.getLast(str1)));
}
@Test
public void operatorCheck() {
	String str="select venue and from ipl.csv";
	QueryExtract qe=new QueryExtract();
	String []result1= {"and"};
	assertArrayEquals(result1,qe.getOperators(str));		
}*/
//operators or orderby ko alg alg krna pdega
@Test
public void aggregateCheck(){			
	QueryExtract qe=new QueryExtract();
	String str="select min(venue) from ipl.csv where venue = mohali";
	String str1="min(venue)";
	ArrayList<String> list=new ArrayList();
	list.add(str1);
    System.out.println(qe.getAggregate(str));
	assertTrue(list.equals(qe.getAggregate(str)));
	//output same de rha h pr fail ho rha h 


}}
