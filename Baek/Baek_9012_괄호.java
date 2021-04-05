package day210403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 
 * Author   : 박정주
 * Date     : 2021-04-03
 * Category : 스택
 * Level    : Silver IV
 * URL      : https://www.acmicpc.net/problem/9012
 */
public class Baek_9012_괄호 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String line = br.readLine();
			Stack<Character> stack = new Stack<>();

			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);

				if (!stack.isEmpty() && (ch == ')' && stack.peek() == '(')) {
					stack.pop();
					continue;
				}
				stack.add(ch);
			}

			if (stack.isEmpty()) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
