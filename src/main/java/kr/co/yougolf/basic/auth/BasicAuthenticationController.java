package kr.co.yougolf.basic.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthenticationController {
	
	@GetMapping("/basicauth")
	public AuthenticationBean helloWordBean() {
		return new AuthenticationBean("You are authenticated");
	}	

}
