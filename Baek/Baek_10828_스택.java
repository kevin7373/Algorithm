package day210406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Author   : 박정주 
 * Date     : 2021-04-06
 * Category : 스택
 * Level    : Silver IV
 * URL      : https://www.acmicpc.net/problem/10828
 */
public class Baek_10828_스택 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] stack = new int[N + 1];
		int stackTop = -1;

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			switch (order) {
			case "push":
				int value = Integer.parseInt(st.nextToken());
				stack[++stackTop] = value;
				break;
			case "pop":
				if (stackTop < 0) {
					sb.append("-1").append("\n");
					break;
				} else {
					sb.append(stack[stackTop--]).append("\n");
				}
				break;
			case "size":
				sb.append(stackTop + 1).append("\n");
				break;
			case "empty":
				if (stackTop < 0) {
					sb.append("1").append("\n");
				} else {
					sb.append("0").append("\n");
				}
				break;
			case "top":
				if (stackTop < 0) {
					sb.append("-1").append("\n");
				} else {
					sb.append(stack[stackTop]).append("\n");
				}
				break;
			}
		}
		System.out.println(sb.toString());
	}
}
