package day210128;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Category : 문자열 처리
 * Level    : Level 1
 */
public class Prog_신규아이디추천_Deque {
	public static void main(String[] args) {
		String str = "...!@BaT#*..y.abcdefghijklm";

		System.out.println(solution(str));
	}

	public static String solution(String new_id) {
		Deque<Character> dq = new LinkedList<>();
		Deque<Character> newDq = new LinkedList<>();

		// 1단계
		new_id = new_id.toLowerCase();

		// 2단계
		for (int i = 0; i < new_id.length(); i++) {
			if (new_id.charAt(i) >= 'a' && new_id.charAt(i) <= 'z') {
				dq.offer(new_id.charAt(i));
			} else if (new_id.charAt(i) >= '0' && new_id.charAt(i) <= '9') {
				dq.offer(new_id.charAt(i));
			} else if (new_id.charAt(i) == '-' || new_id.charAt(i) == '_' || new_id.charAt(i) == '.') {
				dq.offer(new_id.charAt(i));
			}
		}

		// 3단계
		char prev = dq.poll();
		newDq.offer(prev);

		while (!dq.isEmpty()) {
			char ch = dq.poll();

			if (ch == '.' && ch == prev) {
				continue;
			} else {
				newDq.offer(ch);
			}
			prev = ch;
		}

		// 4단계
		while (newDq.size() >= 1 && (newDq.peekFirst() == '.' || newDq.peekLast() == '.')) {
			if (newDq.peekFirst() == '.') {
				newDq.pollFirst();
			} else if (newDq.peekLast() == '.') {
				newDq.pollLast();
			}
		}

		// 5단계
		if (newDq.size() == 0) {
			newDq.offer('a');
		}

		// 6단계
		while (newDq.size() >= 16) {
			newDq.pollLast();
		}

		while (newDq.peekLast() == '.') {
			newDq.pollLast();
		}

		// 7단계
		while (newDq.size() <= 2) {
			newDq.offer(newDq.peekLast());
		}
		StringBuilder sb = new StringBuilder();

		while(!newDq.isEmpty()) {
			sb.append(newDq.poll());
		}

		return sb.toString();
	}
}
