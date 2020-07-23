package com.Example.MOCKITO1;

import java.util.List;
import static org.junit.Assert.*;  
import static org.mockito.Mockito.when;  

import org.junit.Test;
import static org.mockito.Mockito.mock;  

public class TestList {

	@Test
	public void testList_ReturnSingle_value()
	{
		List mocklist=mock(List.class);
		when (mocklist.size()).thenReturn(1);
		
		assertEquals(1,mocklist.size());
		assertEquals(1,mocklist.size());	
		
		System.out.println(mocklist.size());
		
		System.out.println(mocklist);
	}
	
}
