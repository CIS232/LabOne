package edu.cis232;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserChecker {

	public static void main(String[] args) throws IOException {
		ArrayList<String> users = loadUsers();
		//printUsers(users);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a username");
		String input = keyboard.nextLine();
		
		boolean found = false;
		for(String user:users){
			if(user.equalsIgnoreCase(input)){
				System.out.println("Hello " +user);
				found = true;
			}
		}
		
		if(!found){
			System.out.println("Access Denied");
		}
		
	}

	private static void printUsers(ArrayList<String> users) {
		for(String user: users){
			System.out.println(user);
		}
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
