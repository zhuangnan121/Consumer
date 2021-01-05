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
        	String hello = demoService.sayHello("lxt"); // ִ��Զ�̷���
	        System.out.println( hello ); // ��ʾ���ý��
		}
		
		return "ok";
	}

}
