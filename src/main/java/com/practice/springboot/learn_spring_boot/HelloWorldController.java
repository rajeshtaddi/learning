package com.practice.springboot.learn_spring_boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	public static void main(String[] args) {

		int[] nums = {1,1,1,1,2,2,3,4,6,7};  
		
		List<Integer> abc = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {

			abc.add(nums[i]);
		}
		Collections.sort(abc);
		
		for(int i=0;i<abc.size()-1;i=i+2) {
			System.out.println("OUTSIDE");
			System.out.println(abc.get(i));
			System.out.println(abc.get(i+1));
			if(abc.get(i)!=abc.get(i+1))
				System.out.println("-----------------");
		}
			
	}
	

}
