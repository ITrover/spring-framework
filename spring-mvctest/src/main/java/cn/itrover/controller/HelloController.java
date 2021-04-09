package cn.itrover.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/hello", produces = "text/html;charset=UTF-8")
	public String hello() {
		System.out.println("访问hello");
		return "hello world";
	}

}
