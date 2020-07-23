package com.Example.MOCKITO2;

import java.util.List;

public interface ToDoService {
	
	public List<String> getTodos(String user);
	public void deleteTodos(String doString);

}
