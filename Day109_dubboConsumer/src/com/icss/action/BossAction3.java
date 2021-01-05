package com.icss.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icss.service.DemoService;


@Controller
public class BossAction {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/test")
	public String getList() {
		
		for (int i = 0; i < 10; i++) {
        	String hello = demoService.sayHello("lxt"); // 执行远程方法
	        System.out.println( hello ); // 显示调用结果
		}
		
		return "ok";
	}

}
