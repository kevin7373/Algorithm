package day210408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * Author   : 박정주 
 * Date     : 2021-04-08
 * Category : 스택
 * Level    : Silver III
 * URL      : https://www.acmicpc.net/problem/10799
 */
public class Baek_10799_쇠막대기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sticks = br.readLine();
		Stack<Character> stack = new Stack<>();
		int answer = 0;

		for (int i = 0; i < sticks.length(); i++) {
			char nowChar = sticks.charAt(i);

			if (nowChar == '(') {
				stack.add(nowChar);
			} else {
				char preChar = sticks.charAt(i - 1);
				stack.pop();

				if (preChar == '(') {
					answer += stack.size();
				} else {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
