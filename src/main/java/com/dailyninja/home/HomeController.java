package com.dailyninja.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/")
	public String home() {
		return "Hello User";
	}

	@RequestMapping(value = { "/hello" })
	public String hello() {
		return "Hello Mukesh";
	}

}
