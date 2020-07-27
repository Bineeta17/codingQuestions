package com.Example.PowerMock;

public class MockingPrivateMethods {
	
	private String PrivateMethod(String message)
	{
		return message;
	}
	
	public String callPrivateMethod(String message)
	{
		return PrivateMethod(message);
	}

}
