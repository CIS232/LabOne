package edu.cis232;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserChecker {

	public static void main(String[] args) throws IOException {
		ArrayList<String> users = loadUsers();
		
	}

	private static ArrayList<String> loadUsers() throws FileNotFoundException {
		Scanner inputFile = new Scanner(new File("users.txt"));
		ArrayList<String> users = new ArrayList<>();
		
		while(inputFile.hasNext()){
			users.add(inputFile.nextLine());
		}
		inputFile.close();
		return users;
	}

}
