package com.exercise.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();

		words.add("Hello");
		words.add("Book");
		words.add("Cable");
		words.add("Home");
		words.add("Class");
		words.add("Pen");
		words.add("Phone");
		words.add("Apple");
		words.add("Orenge");
		words.add("Table");

		findWord(words);

	}

	public static void findWord(ArrayList<String> words) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the word length: ");

		int length = scanner.nextInt();	

		for(String word : words) {

			if(word.length() == length) {

				System.out.println(word);
			}
		}

		scanner.close();
	}

}
