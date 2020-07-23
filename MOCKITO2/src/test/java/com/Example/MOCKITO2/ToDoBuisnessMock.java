package com.Example.MOCKITO2;

import org.junit.Test;
import static org.mockito.Mockito.mock;  
import static org.mockito.Mockito.verify;  
import static org.mockito.BDDMockito.given;  
  
import java.util.Arrays;  
import java.util.List;  

public class ToDoBuisnessMock {

	@Test
	public void deletetodousing_BDD()
	{
		ToDoService todoService = mock(ToDoService.class);  
        
        List<String> combinedlist = Arrays.asList("Use Hibernate Java", "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");  
          
            given(todoService.getTodos("dummy")).willReturn(combinedlist);  
          
        ToDoBuisness business = new ToDoBuisness(todoService);  
      
        //When  
         business.deleteTodosNotRelatedToHibernate("dummy");  
          
        //Then  
        verify(todoService).deleteTodos("Use Spring MVC");  
        }  
	
	
}

