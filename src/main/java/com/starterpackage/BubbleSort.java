package com.starterpackage;


import org.springframework.stereotype.Component;

@Component
public class BubbleSort extends Sort {

	BubbleSort() {
		System.out.println("Bubble Sort");
	}

	@Override
	public void sorting() {
		System.out.println("Bubble Sort Called");
	}
}
