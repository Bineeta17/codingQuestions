package com.Example.PowerMock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)  
@PrepareForTest(MockingPrivateMethods.class)  
public class powermock_test_privatMethod {
	
 @Test	
 public void TestPrivateMethod_WithPowerMock() throws Exception
 {
	String message="PowerMock with mockito and junit";
	String expectedmessage="using with easyMock";
	
	MockingPrivateMethods mock=PowerMockito.spy(new MockingPrivateMethods());
	PowerMockito.doReturn(expectedmessage).when(mock,"PrivateMethod",message);
	
	String actualmessage=mock.callPrivateMethod(message);
	assertEquals(expectedmessage,actualmessage);
	
	System.out.println(PowerMockito.verifyPrivate(getClass()));
	
	

 }
	

}
