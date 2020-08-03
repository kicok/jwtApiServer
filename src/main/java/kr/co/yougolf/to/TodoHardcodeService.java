package kr.co.yougolf.to;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.yougolf.todo.Todo;

@Service
public class TodoHardcodeService {
	
	private static List<Todo> todos = new ArrayList();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "yougolf", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "yougolf", "Learn about MicerSerivce", new Date(), false));
		todos.add(new Todo(++idCounter, "yougolf", "Learn about English", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}

}
