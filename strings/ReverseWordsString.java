import java.util.*;

public class ReverseWordsString {
	public static void main(String[] args) {
		System.out.println(reverseWordsString("need for code"));
	}

	public static String reverseWordsString(String str) {
		int len = str.length();

		if(len == 0 || len == 1 || str == " ") {
			return str;
		}

		char[] charStr = str.toCharArray();

		int i=0;
		for(int j=1; j<len; j++) {
			if(charStr[j] == ' ') {
				reverse(charStr,i,j-1);
				i=j+1;
			}
		}

		reverse(charStr,i,len-1);

		return String.valueOf(charStr);
	}

	public static void reverse(char[]charStr, int i, int j) {

		while(i<j) {
			char temp = charStr[j];
			charStr[j]=charStr[i];
			charStr[i]=temp;
			i++;j--;
		}
	}
}