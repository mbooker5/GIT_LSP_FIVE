package org.howard.edu.lsp.assignment2;

import java.util.HashMap;
import java.io.FileNotFoundException;

public class WordCounter {
	public static void main(String[] args) {
		FileReader fileReader = new FileReader();
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		try {
			String fileContents = fileReader.readToString("words.txt");
			String[] fileWords = fileContents.toLowerCase().replaceAll("[^a-zA-z ]", "").split(" ");
			for (int x = 0; x < fileWords.length; x++) {
				if (fileWords[x].length() > 3) {
					if (hashmap.get(fileWords[x]) != null) {
						hashmap.put(fileWords[x], hashmap.get(fileWords[x]) + 1);
					}
					else {
						hashmap.put(fileWords[x], 1);
					}
				}
			}
			for (String word : hashmap.keySet()) {
				System.out.println(word + " " + hashmap.get(word));
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found in directory");
		}
	
	}
}
