package project1.example;


/*Name  : Drashti Devani(100851691)
Program : Class Exercise 1
Date : 27 January, 2023
Description : This program print welcome message, a quote from book and ask user for input and print with proper message.*/


import java.util.Scanner;

public class IC1_drashtidevani_100851691 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double user_input = 0;

		String welcome_msg = "Welcome to Drashti's Code. Its Drashti Devani with student id 100851691";
		System.out.println("" + welcome_msg + "\n");

		String fav_quote = "'The key to having more opportunities in life is to give yourself enough \n opportunities to get curious.'";
		String mention_source = "https://www.goodreads.com/work/quotes/94177047-do-epic-shit";
		
		System.out.println(
				"My Favorite quote from book DO EPIC SHIT : " + fav_quote + " And source is  : " + mention_source);

		System.out.println("\nPlease enter a percentage of last semester : ");
		
		user_input = input.nextDouble();
		System.out.println("Your last semester's percentage is : " + user_input);
	}

}
