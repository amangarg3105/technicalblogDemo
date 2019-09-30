package com.starterpackage;

import java.util.ArrayList;

public class ArrayEmpty {

	public static boolean isNotEmpty(ArrayList<Integer> arr) {
		if(arr != null && arr.size() == 0) {
			return  true;
		}
		return false;
	}
}
