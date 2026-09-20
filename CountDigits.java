package day6;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// program to Count Number of Digits in a Number (looping) ->
		// Example: Input : 423424 and output : 6

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integer number: ");

		int num = scanner.nextInt();
		int originalNum = num;//Original entered number
		int count = 0;//Variable to count digits in number

		if (num == 0) {//condition to check if user entered number as 0
			count = 1;
		} else {//implemented while loop to get the count of digits

			while (num > 0) {
				num = num / 10;//To remove last digit from number in a loop
				count++;//to count each digit of number

			}
		}

		System.out.println("Number of Digits in " + originalNum + " is: " + count);

	}

}
