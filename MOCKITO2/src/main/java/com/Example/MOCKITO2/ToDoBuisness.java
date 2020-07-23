package com.Example.MOCKITO2;

import java.util.List;  

public class ToDoBuisness {
	
	public ToDoService doService;

	public ToDoBuisness(ToDoService doService) {
		
		this.doService = doService;
	}
	
	public void deleteTodosNotRelatedToHibernate(String user)
	{
		List<String> CombinedList=doService.getTodos(user);
		
		for(String todos:CombinedList)
		{
			if(!todos.contains("Hibernate"))
			{
				doService.deleteTodos(todos);
			}
		}
		
	}
	
	

}
