package com.example.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SearchApplication {
	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
		int[] arr = {1,2,3,4,5};
		BinarySearch binarySearch = new BinarySearch();
		LinearSearch linearSearch = new LinearSearch();
		int binarySearchResult = binarySearch.binarySearch(arr,3);
		if(binarySearchResult != -1){
			printResults(binarySearchResult,"Binary");
		}

		int linearSearchResult = linearSearch.linearSearch(arr,3);
		if(linearSearchResult != -1){
			printResults(binarySearchResult,"Binary");
		}

		int[] arr1 = {19,2,8,4,5};
		Arrays.sort(arr1);
		for (int a: arr1) {
			System.out.print(a+" ");
		}

	}

	private static void printResults(int searchResult, String method) {
		System.out.println(method +"Search Target Elements Found at the INDEX : "+searchResult);
	}

}
