package day210406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * Author   : 박정주 
 * Date     : 2021-04-06
 * Category : 스택
 * Level    : Silver III
 * URL      : https://www.acmicpc.net/problem/1406
 */
public class Baek_1406_에디터 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		Stack<Character> stackA = new Stack<>();
		Stack<Character> stackB = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			stackA.push(str.charAt(i));
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		for (int n = 1; n <= N; n++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			switch (order) {
			case "L":
				if (!stackA.isEmpty()) {
					stackB.push(stackA.pop());
				}
				break;
			case "D":
				if (!stackB.isEmpty()) {
					stackA.push(stackB.pop());
				}
				break;
			case "B":
				if (!stackA.isEmpty()) {
					stackA.pop();
				}
				break;
			case "P":
				char value = st.nextToken().charAt(0);
				stackA.push(value);
			default:
				break;
			}
		}
		
		while(!stackA.isEmpty()) {
			stackB.push(stackA.pop());
		}
		
		while(!stackB.isEmpty()) {
			sb.append(stackB.pop());
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
