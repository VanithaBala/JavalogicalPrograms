import java.io.*;
import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int flag = 0;
		System.out.println("Enter the number to find prime");
		int no = inp.nextInt();
		for (int i = 2; i <= no/2 ; i++) {
			if ((no % i) == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Prime");

		else
			System.out.println("Not prime");
	}
}
