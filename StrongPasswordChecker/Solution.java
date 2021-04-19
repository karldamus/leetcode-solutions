package StrongPasswordChecker;

import java.lang.*;

/**
 * Solution to the Strong Password Checker Problem
 * https://leetcode.com/problems/strong-password-checker
 * 
 * @author Karl Damus
 * 
 * Password considered strong if:
 * 	It has at least 6 characters and at most 20 characters.
 * 	It contains at least one lowercase letter, at least one uppercase letter, and at least one digit.
 * 	It does not contain three repeating characters in a row (i.e., "...aaa..." is weak, but "...aa...a..." is strong, assuming other conditions are met).
 * 
 * runtime: ms (xx test cases)
 */
public class Solution {
	public static int strongPasswordChecker(String password) {
		// return Math.min((numCharacters(password) + upperLowerAndDigits(password) + noRepeatingCharacters(password)), 5);
		if (numCharacters(password) == 0) {
			return Math.min((numCharacters(password) + upperLowerAndDigits(password) + noRepeatingCharacters(password)), 5);
		}
		else {
			if (numCharacters(password) > 4 || numCharacters(password) < 2) {
				return numCharacters(password);
			}
		}
	
	}

	private static int numCharacters(String password) {
		if (password.length() < 6) {
			System.out.println("length < 6");
			System.out.println("6 - length => " + (6 - password.length()));
			return 6 - password.length();
		}
		else if (password.length() > 20) {
			System.out.println("length > 20");
			return password.length() - 20;
		}
		else {
			System.out.println("length ok");
			return 0;
		}
	}
	private static int upperLowerAndDigits(String password) {
		int upper = 1;
		int lower = 1;
		int digits = 1;

		char[] passwordAsCharArray = password.toCharArray();

		for (char c : passwordAsCharArray) {
			if (Character.isUpperCase(c)) upper = 0;
			if (Character.isLowerCase(c)) lower = 0;
			if (Character.isDigit(c)) digits = 0;
		}
		System.out.println("upper => " + upper + ", lower => " + lower + ", digits => " + digits);
		return upper + lower + digits;
	}
	private static int noRepeatingCharacters(String password) {
		int count = 0;
		for (int i = 0; i < password.length() - 2; i ++) {
			try {
				if (password.charAt(i) == password.charAt(i + 1) && password.charAt(i) == password.charAt(i + 2)) {
					count += 1;
				}
			} catch (NullPointerException n) {
				return -1;
			}
		}
		System.out.println("repeating => " + count);
		return count;
	}

	public static void main(String[] args) {
		// System.out.println(strongPasswordChecker("sdfsiisdfsdf"));
		// System.out.println(strongPasswordChecker("!s7HfajkE"));
		// System.out.println(strongPasswordChecker("!s7HfaaaE"));
		System.out.println(strongPasswordChecker("a"));
	}
}
