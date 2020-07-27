package com.Example.PowerMock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)  
@PrepareForTest(MockingStaticMethods.class)  
public class Powermock_test_staticMethod {
	
	@Test
	public void TestStaticMethod_WithPowerMockito()
	{
		String call="Hi there,i'm using powerMock with Mockito";
		String callexpectation="call expectation for you";
		
		PowerMockito.mockStatic(MockingStaticMethods.class);
		PowerMockito.when(MockingStaticMethods.staticMethod(call)).thenReturn(callexpectation);
		
		String actualcall=MockingStaticMethods.staticMethod(call);
	    assertEquals(callexpectation,actualcall);
	    
//	    PowerMockito.verifyStatic();
//	    Utility.staticMethod(call);
	}

}
