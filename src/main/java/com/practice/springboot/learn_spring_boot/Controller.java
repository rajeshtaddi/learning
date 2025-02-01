package com.practice.springboot.learn_spring_boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

	@RequestMapping("/Testing")
	public List<Dto> provide(){ 
		
		 List<Dto> list = new ArrayList<>();
		 
		 Dto dto1 = new Dto();
		 dto1.setId(1);
		 dto1.setName("Madhav");
		 dto1.setJob("Specalist");
		 
		 Dto dto2 = new Dto(2,"Shubham","TeamLead");
		 list.add(dto1);
		 list.add(dto2);
		 return list;
	}
}
