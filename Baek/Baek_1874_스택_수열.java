package day210405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 
 * Author   : 박정주
 * Date     : 2021-04-05
 * Category : 스택
 * Level    : Silver III
 * URL      : https://www.acmicpc.net/problem/1874
 */
public class Baek_1874_스택_수열 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int max = 0;

		for (int n = 1; n <= N; n++) {
			int k = Integer.parseInt(br.readLine());

			if (k > max) {
				for (int i = max; i < k; i++) {
					stack.add(i + 1);
					sb.append("+").append("\n");
				}
			} else {
				if (stack.peek() != k) {
					System.out.println("NO");
					return;
				}
			}
			sb.append("-").append("\n");
			stack.pop();

			if (k > max) {
				max = k;
			}
		}
		System.out.println(sb.toString());
	}
}
