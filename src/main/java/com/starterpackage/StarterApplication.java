package com.starterpackage;


import org.apache.commons.collections4.CollectionUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;

@SpringBootApplication
public class StarterApplication {
	public static void main(String[] args) {
//		System.out.println("This is main method");
//
//		ArrayList<Integer> arr = new ArrayList<>(); // int [] arr = new int[];
//		arr.add(1);
//		arr.add(2);
//
//
//
//		if(CollectionUtils.isNotEmpty(arr)) {
//			System.out.println("This array is not empty");
//		}
//
//		if(ArrayEmpty.isNotEmpty(arr)) {
//
//		}
//

//		1. There was a  problem of changing the sorting object in every controller
//
//		2. Create a common class that is sort and every type of sorting would get extented to this common sort class
//
//		3. Create a spring container which will have object of appropriate sorting algorithm
//
//		4. Controller would communicate to this container to get the proper sorting logic.
		SpringApplication.run(StarterApplication.class, args);
	}
}
