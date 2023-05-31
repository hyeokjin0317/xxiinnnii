package backjun5;

import java.util.Scanner;

public class BackJun10809 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];

		String s = sc.next();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) (97 + i);
			int a = s.indexOf(arr[i]);

			System.out.print(a + " ");

		}
	}
}