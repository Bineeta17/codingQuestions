package com.Example.PowerMock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.junit.Assert.assertEquals;


@RunWith(PowerMockRunner.class)  
@PrepareForTest(MockingFinalMethods.class)  
public class powermock_test_finalMethod {
	
	
	@Test
	public void  TestFinalMethod_WithPowerMock() throws Exception
	{
		
		String message="PowerMock with Mockito and junit";
		
		MockingFinalMethods mock=PowerMockito.mock(MockingFinalMethods.class);
		PowerMockito.whenNew(MockingFinalMethods.class).withNoArguments().thenReturn(mock);
		
		MockingFinalMethods obj=new MockingFinalMethods();
		PowerMockito.verifyNew(MockingFinalMethods.class).withNoArguments();
		
		PowerMockito.when(obj.FinalMethod(message)).thenReturn(message);
		
		String message2=obj.FinalMethod(message);
		Mockito.verify(mock).FinalMethod(message);
		assertEquals(message,message2);
		
	}
	

}
