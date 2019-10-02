package com.starterpackage;

public class SortingRunner {

	//Sort is a depenecy for sorting runner
	// We are instantiating sort inside the sorting runner, this is basically known dependency injection
	//In other words creating the object of some class in some different class is known as dependency injection.
	Sort sort;

	BinarySearch binarySearch;

	//Rotate rotate;

//	Search search;


	//Constructor based Dependency Injection
	SortingRunner(Sort sort, BinarySearch binarySearch) {
		this.sort = sort;
		this.binarySearch = binarySearch;
	}

	SortingRunner(Sort sort) {
		this.sort = sort;
	}

	//SortingRunner()


	//setter based dependency Injection
	public void setSort(Sort sort) {
		this.sort = sort;
	}

//	public void setSearch() {
//		search = new  Binary()
//	}


	public static void main() {
		Sort sort = new MergeSort();
		BinarySearch binarySearch = new BinarySearch();
		SortingRunner sortingRunner = new SortingRunner(sort, binarySearch);
		//sortingRunner.setSearch();


		SortingRunner sortingRunner1 = new SortingRunner();
		sortingRunner1.setSort(sort);

	}
}
