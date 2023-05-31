package backjun5;

import java.util.Scanner;

public class BackJun8958 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int count = 0;
			sum = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'O') {
					count++;
					sum += count;
				} else if (s.charAt(j) == 'X') {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}

}
