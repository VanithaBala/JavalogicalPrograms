import java.io.*;
import java.util.*;

public class Fibonaaci {
	public static void main(String args[]) {
		int num=0,num1 = 0, num2 = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit = input.nextInt();
		System.out.println("Fibonacci Series");
		System.out.println(num1+ "\n" +num2);
		for (int i = 0; i < limit-2; i++) {
			 num = num1 + num2;
			num1 = num2;
			num2 = num;
			System.out.println(num);
		}


	}
}
