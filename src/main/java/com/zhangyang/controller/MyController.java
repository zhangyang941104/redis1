package com.zhangyang.controller;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   //不要忘加控制层注解
public class MyController {
   //注入redisTempalte
	@Resource
	private RedisTemplate redisTemplate;
	
	//列表
	@RequestMapping("/list1")
	public String list(Model model) {
		//获取添加时绑定的key
//		BoundListOperations ops = redisTemplate.boundListOps("pro");
     	System.out.println("执行chaxunn");
//		//查询
//		List list = ops.range(0, -1);
//		model.addAttribute("list", list);
		return "list";
	}
}
