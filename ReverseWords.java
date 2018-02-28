
public class ReverseWords {
public static void main(String args[]){
	String str="this is to reverse each word in the string";
	String[] words=str.split(" ");
	String revstr="";
	for(int i=0;i<words.length;i++){
		String count=words[i];
		String revWord="";
	for(int j=count.length()-1;j>=0;j--){
		revWord=revWord+count.charAt(j);
	}
	revstr=revstr+revWord+" ";
}
	System.out.println("Reversed words are\n"+" "+revstr);
}
}
