package backjun5;

import java.util.Scanner;

public class BackJun14659 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = 0;
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[i] > arr[j + 1]) {
					count ++;
					max = Math.max(count, max);
				} else if (arr[i] < arr[j + 1]) {
					break;
				}
			}
		}
		System.out.println(max);
	}
}
