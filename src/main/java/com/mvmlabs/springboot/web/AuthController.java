package com.mvmlabs.springboot.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
 
/**
 * Controller that demonstrates tiles mapping, reguest parameters and path variables.
 * 
 * @author Mark Meany
 */
@Controller
public class AuthController {
	private Log log = LogFactory.getLog(this.getClass());

    @GetMapping( "/auth" )
	public String home() throws Exception {
		//throw new Exception("error");
	   return "/auth/login";
	}
}
