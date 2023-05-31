package backjun5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJun28061 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int max = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			int a = Integer.parseInt(st.nextToken());
			int s = n + 1 - i;
			int b = a - s;
			max = Math.max(b, max);

		}

		System.out.println(max);
	}

}
