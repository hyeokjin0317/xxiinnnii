package backjun5;

import java.util.Scanner;

public class BackJun2525 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int n = 0;

		n = (h * 60) + m + c; // 4200  
		h = n / 60; // 70 %24 = 22
		m = n % 60; // 0

		while (h >= 24) {
			h = h - 24; // 46
		}

		System.out.println(h + " " + m);

	}

}
