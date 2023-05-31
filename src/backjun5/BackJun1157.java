package backjun5;

import java.util.Scanner;

public class BackJun1157 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int max = 0;
		char c = ' ';

		char[] arr = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			arr[i] = s.charAt(i);
			for (int j = 0; j < s.length(); j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
				if (max < count) {
					max = arr[i];
					c = (char) (max);
				}
			}
		}
		System.out.println(c);

	}

}
