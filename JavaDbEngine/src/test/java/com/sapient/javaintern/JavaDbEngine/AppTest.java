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
{  QueryExtract qe;
   @BeforeEach
   void beforeEach() {
	   qe= new QueryExtract();
	   qe.getFields(null);
   }


@Test
public void check1() {
	QueryExtract qe=new QueryExtract();
	String str="select venue from ipl.csv";
	ArrayList<String> result1= new ArrayList<String>();
	result1.add("select");
	result1.add("venue");
	result1.add("from");
	result1.add("ipl.csv");
	assertEquals(result1,qe.getFields(str));
}
@Test
public void check3(){			
	QueryExtract qe=new QueryExtract();
	String str="select venue from ipl.csv where venue = mohali";
	ArrayList<String> result2=qe.getFile(str);
	assertTrue(result2.equals("select venue from ipl.csv "));
}
}
