
public class WordCount {
	public static void main(String args[]) {
		String str = "this is string example in java";
		int count = 1;
		for (int i = 0; i < str.length()-1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
			
		}
		System.out.println("Number of words in the string is"+ "  "+count);
	}
}