// Program to find duplicate words and their occurance in a string
public class DuplicateWordcount {

	public static void main(String[] args) {
		int i, j, wc = 1;
		String sen = "java session entity session";
		String words[] = sen.split("");
		for (i = 0; i < words.length; i++) {
			for (j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					wc = wc + 1;
					words[i] = "0";
				}
			}
			if (words[i] != "0") {
				System.out.println(words[i] + " " + wc);
				wc = 1;
			}
		}
	}
}
