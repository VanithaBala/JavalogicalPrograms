import java.util.Scanner;

// program to find number of words in a string
public class Duplicatewords {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int count = 1;
		System.out.println("Enter a string");
		String s = input.nextLine();
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in the given string is" + "  " + count);
	}

}