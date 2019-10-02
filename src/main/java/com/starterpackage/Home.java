package com.starterpackage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

	@Autowired
	Sort sort;



	@RequestMapping("home")
	@ResponseBody
	public String homeMethod() {

//		for(){
//			for {
//
//			}
//		}

	//	break the array in two halves recursively and merge them
         sort.sorting();
		return "This is home page";
	}
}
