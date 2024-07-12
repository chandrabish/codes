package lec02;

public class find {
	 public static void moveAllX(String str , int idx , int count , String newstring) {
		 if(idx == str.length()){
			 for(int i=0 ; i<count; i++) {
				 newstring += 'x';
			 }
			 System.out.println(newstring);
			 return;
		 }
		 char currChar = str.charAt(idx);
			 if(currChar == 'x') {
				 count++;
				 moveAllX(str, idx+1 , count , newstring);
			 }else {
				 newstring += currChar;
				 moveAllX(str, idx+1 , count , newstring);
				 
			 }
		 }
		 public static void main(String[] args) {
			 String str = "axfbgtxmfkrmsxxxxxxxkmmbsx";
			 moveAllX(str , 0 , 0 , " ");
		 }
	 }
	 


