package com.Example.MOCKITO1;

import static org.junit.Assert.assertEquals;  
import static org.mockito.Mockito.mock;  
import static org.mockito.Mockito.when;  
  
import java.util.Arrays;  
import java.util.List;  
import org.junit.Test;  

public class ToDoBuisnessMock {
	  
	@Test
	public void testusing_Mocks()
	{
		ToDoService doService=mock(ToDoService.class);
		
		List<String> combinedlist=Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use w3eHibernate ", " Use Spring MVC ");
		when(doService.getTodos("dummy")).thenReturn(combinedlist);
		
		ToDoBuisness buisness =new ToDoBuisness(doService);
		
		List<String> alltd=buisness.getToDosforHibernate("dummy");
		
		System.out.println(alltd);
		assertEquals(1,alltd.size());
	}

}
