package kr.co.yougolf.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= {"http://localhost:4200"})
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWordBean() {
		return new HelloWorldBean("hello World bean");
	}
	
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWordPathVariable(@PathVariable String name) {
		//throw new RuntimeException("somthing exception");
		return new HelloWorldBean(String.format("hello World bean %s", name));
	}
}
