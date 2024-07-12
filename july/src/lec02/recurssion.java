package lec02;

public class recurssion {
	public static boolean[] map = new boolean [26];
	 
	public static void printReverse(String str , int idx, String newstring) {
		if(idx == str.length()) {
			System.out.println(newstring);
			return ;
		}
		char currChar = str.charAt(idx);
		if(map [currChar - 'a'] == true) {
			printReverse(str , idx+1 , newstring);
		}else {
			newstring += currChar;
			map[currChar - 'a'] = true;
			printReverse(str , idx+1 , newstring);
			
		}
	}
	public static void main(String[] args) {
		String str = "aaccvnghhhtrdm";
		printReverse(str , 0, " ");
	}

}
