package lesson_303_4.guidedLab_303_3_2;

import java.util.Scanner;

public class ReadingStringFromConsole1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three words separated by spaces: ");
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
		System.out.println("s3 is " + s3);
	}

}
