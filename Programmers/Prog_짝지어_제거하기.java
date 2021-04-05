package day210402;

import java.util.Stack;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Level    : Level 2
 */
public class Prog_짝지어_제거하기 {
	public static int solution(String s) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));

		for (int i = 1; i < s.length(); i++) {
			if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
				stack.pop();
			} else {
				stack.push(s.charAt(i));
			}
		}
		
		if (stack.isEmpty()) {
			answer = 1;
		}
		return answer;
	}

	public static void main(String[] args) {
		String str = "baabaa";

		System.out.println(solution(str));
	}
}
