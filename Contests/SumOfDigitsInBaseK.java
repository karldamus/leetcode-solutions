public class SumOfDigitsInBaseK {
	public static void main(String[] args) {
		System.out.println(sumBase(101, 10));
	}

	public static int sumBase(int n, int k) {
		if (k == 10) { return getSumOfDigits(n); }

		return convertBase(n, k);
	}

	public static int converBase(int integer, int base) {
		

		return -1;
	}

	
	public static int getSumOfDigits(int digit) {
		int[] temp = new int[Integer.toString(digit).length()];
		for (int i = 0; i < Integer.toString(digit).length(); i++)
		{
			temp[i] = Integer.toString(digit).charAt(i) - '0';
		}

		int sum = 0;
		for (int v : temp) {
			sum += v;
		}

		return sum;
	}
}