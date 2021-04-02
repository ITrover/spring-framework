package cn.itrover.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class IndexController {
	@GetMapping(value = {"/index","/"})
	public String index() {
		System.out.println("访问首页");
		return "index.jsp";
	}
}
