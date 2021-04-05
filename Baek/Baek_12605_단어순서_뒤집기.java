package day210403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 
 * Author   : 박정주
 * Date     : 2021-04-03
 * Category : 스택 / 큐
 * Level    : Bronze I
 * URL      : https://www.acmicpc.net/problem/12605
 */
public class Baek_12605_단어순서_뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Stack<String> stack = new Stack<>();
			
			while(st.hasMoreTokens()) {
				stack.add(" " + st.nextToken());
			}
			sb.append("Case").append(" ").append("#").append(i).append(":");
			
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
