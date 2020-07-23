package com.Example.MOCKITO;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestCalculator {
	Calculator c=null;
	CalculatorService service=mock(CalculatorService.class);
	
	@Before
	public void setUp()
	{
		c=new Calculator(service);
	}
	
	@Test 
	public void testPerform()
	{
		when(service.add(2,3)).thenReturn(5);
		assertEquals(10,c.perform(2, 3));
	}

}
