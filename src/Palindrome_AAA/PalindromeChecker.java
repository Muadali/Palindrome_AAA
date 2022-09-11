package Palindrome_AAA;
/**
 * This program uses a stack to check if a user inputted string is a palindrome
 * A palindrome is defined as a word or phrase that is the same forward and backwards
 * 
 * @author Abdifatah
 * 
 */


import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
	String Palindrome;
	
	public static void main(String [] args) {
		
		
		Scanner input= new Scanner (System.in);
		
		System.out.print("Enter a string: ");
		String str=input.nextLine();
		
		//Stack<Character>stack= new Stack<>();
		
		/**
		 * Creating a stack
		 * 
		 */
		
		Stack stack=new Stack();
		
		/**
		 * Pushing all characters of string to stack 
		 * 
		 */
		
		for (int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}//end for
		
		/**
		 * 
		 * Pop all characters of string stack
		 * Basically setting the reverse method
		 * the method will set  if the word can be read same as forward
		 * 
		 */
		
		String reverseString="";
		
		while (!stack.isEmpty()) {
			reverseString=reverseString+stack.pop();
		}//end while 
		
		for (int i=0; i<str.length(); i++) {
			//str.setCharAt(i, stack.pop());
			
		}//end for
		
		if (str.equals(reverseString)) {
			System.out.println("Input string is a palindrome");
		}//end if
		else {
			System.out.println("Input string is nota palindrome.");
		}//end else
		
		
		
		
	}//end main
	

}//end class
