package backjun5;

import java.util.Scanner;

public class BackJun2480 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int m = 0;
		int max = 0;

		if (a == b && a == c && b == c) {
			m = 10000 + a * 1000;
			System.out.println(m);
		} else if (a == b || a == c) {
			m = 1000 + a * 100;
			System.out.println(m);
		} else if (b == c || a == c) {
			m = 1000 + c * 100;
			System.out.println(m);
		} else if (b == c || a == b) {
			m = 1000 + b * 100;
			System.out.println(m);
		}
		if (a != b && a != c && b != c) {
			if (a > max)
				max = a;
			if (b > max)
				max = b;
			if (c > max)
				max = c;
			m = max * 100;
			System.out.println(m);

		}
	}

}
