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
 * Category : 문자열
 * Level    : Bronze I
 * URL      : https://www.acmicpc.net/problem/9093
 */
public class Baek_9093_단어_뒤집기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Stack<Character> stack = new Stack<>();
			
			while(st.hasMoreTokens()) {
				String str = st.nextToken();
				
				for (int i = 0; i < str.length(); i++) {
					stack.add(str.charAt(i));
				}
				
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
