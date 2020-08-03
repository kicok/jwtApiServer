package kr.co.yougolf.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.yougolf.to.TodoHardcodeService;

@RestController
public class TodoResource {
	
	@Autowired
	private TodoHardcodeService todoService;
	
	@GetMapping("/users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username){
		
		return todoService.findAll();
	}
}