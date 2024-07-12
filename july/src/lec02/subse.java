package lec02;

import java.util.HashSet;

public class subse {
	public static void findSubsequnces(String str , int idx , String newstring ,HashSet<String> set) {
		if(idx == str.length()) {
			if(set.contains(newstring)) {;
			return ;
		}else {
			System.out.println(newstring);
			set.add(newstring);
			return;
		}
		}
		char currChar = str.charAt(idx);
		findSubsequnces(str, idx+1 , newstring+currChar , set);
		findSubsequnces(str, idx+1 , newstring, set);
	} 
		
	
public static void main(String[] args) {
	String str = "abc";
	HashSet<String>set = new HashSet<>();
	findSubsequnces(str, 0 , " " , set);
	


}
}

//time complexity


