package Practice;

import java.util.Scanner;

public class LastDigitprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,Last_digit;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number:");
		number=sc.nextInt();
		
		Last_digit=number%10;
		System.out.println("the last digit of given number "+number+"="+Last_digit);

	}

}
