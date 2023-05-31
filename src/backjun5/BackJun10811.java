package backjun5;

import java.util.Arrays;
import java.util.Scanner;

public class BackJun10811 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < m; i++) {
			int I = sc.nextInt();
			int J = sc.nextInt();
			int t = 0;
			while (I < J) {
				t = arr[I - 1];
				arr[I - 1] = arr[J - 1];
				arr[J - 1] = t;
				I++;
				J--;
			}

		}
		for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
	}

}
