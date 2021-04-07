package day210407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * Author   : 박정주 
 * Date     : 2021-04-07
 * Category : 스택
 * Level    : Silver III
 * URL      : https://www.acmicpc.net/problem/17413
 */
public class Baek_17413_단어_뒤집기_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		boolean isStack = true;

		for (int i = 0; i < str.length(); i++) {
			char nowChar = str.charAt(i);

			if (nowChar == '<') {
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				isStack = false;
				sb.append(nowChar);
			} else if (nowChar == '>') {
				isStack = true;
				sb.append(nowChar);
			} else {
				if (isStack) {
					if (nowChar != ' ') {
						stack.add(nowChar);
					} else {
						while (!stack.isEmpty()) {
							sb.append(stack.pop());
						}
						sb.append(nowChar);
					}
				} else {
					sb.append(nowChar);
				}
			}
		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}
}