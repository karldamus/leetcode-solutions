package IsPangram;

/**
 * Solution to the IsPangram Problem
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 * 
 * @author Karl Damus
 */
public class Solution {

	public static boolean checkIfPangram(String sentence) {
		if (sentence.strip().length() < 26) {
			return false;
		}
		else {
			String str = "abcdefghijklmnopqrstuvwxyz";
			char[] letters = str.toCharArray();
			char[] charSentence = sentence.strip().toCharArray();

			return recursivelyCheckIfCharInString(charSentence, letters, 0);
		}
	}

	static boolean recursivelyCheckIfCharInString(char[] sentence, char[] letters, int count) {
		for (char c : sentence) {
			if (c == letters[count]) {
				if (count >= 25) { return true; }
				else {
					return recursivelyCheckIfCharInString(sentence, letters, count += 1);
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		String pangram = "the quick brown fox jumps over the lazy dog";
		String notAPangram = "notAPangram";
		String stillNotAPangram = "ttt thehsu asdsdfks sdfhsdfhsduyfhsdfhsdufsd";

		System.out.println(checkIfPangram(pangram));
		System.out.println(checkIfPangram(notAPangram));
		System.out.println(checkIfPangram(stillNotAPangram));
	}
}
