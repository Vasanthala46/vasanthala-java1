package com.exercise.demo;

import java.util.ArrayList;

public class Exercise02 {

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

		for(String word : words) {

			if(word.length()==5) {
				System.out.println(word);
			}
		}
	}

}