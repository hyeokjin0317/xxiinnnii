package backjun5;

import java.util.Scanner;

public class BackJun10988 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = s.charAt(s.length() - 1 - i);
			if (a != b) {
				flag = false;
			}
		}
		System.out.println(flag ? 1 : 0);

	}

}
