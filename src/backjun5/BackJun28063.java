package backjun5;

import java.util.Scanner;

public class BackJun28063 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 4;

		if (x == 1) count--;
		if (x == n) count--;
		if (y == 1) count--;
		if (y == n) count--;

		System.out.println(count);

	}

}
