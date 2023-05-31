package backjun5;

import java.util.Scanner;

public class BackJun2577 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a * b * c;
		String s = Integer.toString(sum);

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) - '0' == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
