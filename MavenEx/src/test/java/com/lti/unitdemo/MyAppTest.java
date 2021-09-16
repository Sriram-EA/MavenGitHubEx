package com.lti.unitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class MyAppTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	} 
 
	int result=Calculator.add(100,200);
	@Test 
	void testshow()
	{
		MyApp m=new MyApp();
		String s=m.show();
		Assertions.assertEquals("hello maven", s);
	}
	@Test 
	void testadd()
	{
		
		Assertions.assertEquals(300,result);
		Assertions.assertEquals(100, Calculator.add(50, 50),"testing add module");
		
	} 
	
	@Test 
	void testAssertFalse()
	{
		Assertions.assertNotEquals(30, result);  
		Assertions.assertFalse("Sriram".length()==10);
		Assertions.assertFalse(10>20,"comparing two values");
	}  
	@Test 
	void testAssertNull()
	{
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1); 
		Assertions.assertNotNull(s2,"ABC value for s2");
	}
	
//	@Disabled
//	@Test 
//	void testAssertAll()
//	{
//		String str1="abc";
//		String str2="pqr";
//		String str3="xyz";
//		Assertions.assertAll("data",
//				() -> Assertions.assertEquals("abc", str1),
//				() -> Assertions.assertEquals("pqr", str2),
//				() -> Assertions.assertEquals("xyz", str3));
//	} 
//	
//	@Test 
//	void testCollections()
//	{
//		ArrayList<String> myList=new ArrayList<>(); 
//		myList.add("Hello");
//		Assertions.assertFalse(myList.isEmpty()); 
//		
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		Assertions.assertEquals(true,al.isEmpty());
//		
//	}

}