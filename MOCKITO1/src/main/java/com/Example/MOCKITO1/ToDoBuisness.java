package com.Example.MOCKITO1;

import java.util.ArrayList;
import java.util.List;

public class ToDoBuisness {
	
	public ToDoService doService;

	
	
	public ToDoBuisness(ToDoService doService) {
		
		this.doService = doService;
	}



	public List<String> getToDosforHibernate(String user)
	{
		List<String> hibernatelist=new ArrayList<String>();
		List<String> combinedlist=doService.getTodos(user);
		
		for(String todo:combinedlist)
		{
			if(todo.contains("Hibernate"))
			{
				hibernatelist.add(todo);
			}
		}
		return hibernatelist;
		
	}

}
