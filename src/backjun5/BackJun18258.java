package backjun5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BackJun18258 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		LinkedList<Integer> list = new LinkedList<>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				int x = Integer.parseInt(st.nextToken());
				list.add(x);
				break;
			case "pop":
				if (list.size() == 0) {
					bw.write("-1");
					bw.write("\n");
					break;
				}
				bw.write(list.get(0).toString());
				bw.write("\n");
				list.remove(0);
				break;
			case "size":
				bw.write(Integer.toString(list.size()));
				bw.write("\n");
				break;
			case "empty":
				if (list.size() == 0) {
					bw.write("1");
					bw.write("\n");
					break;
				} else {
					bw.write("0");
					bw.write("\n");
					break;
				}

			case "front":
				if (list.size() == 0) {
					bw.write("-1");
					bw.write("\n");
					break;
				}
				bw.write(list.getFirst().toString());
				bw.write("\n");
				break;
			case "back":
				if (list.size() == 0) {
					bw.write("-1");
					bw.write("\n");
					break;
				}
				bw.write(list.getLast().toString());
				bw.write("\n");
				break;
			}
		}
		bw.flush();
	}
}
