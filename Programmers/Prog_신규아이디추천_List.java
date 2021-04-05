package day210128;

import java.util.ArrayList;
import java.util.List;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Category : 문자열 처리
 * Level    : Level 1
 */
public class Prog_신규아이디추천_List {
	public static void main(String[] args) {
		//String str = "...!@BaT#*..y.abcdefghijklm";
		String str = "=.=";

		System.out.println(solution(str));
	}

	public static String solution(String new_id) {
		List<Character> list = new ArrayList<>();
		List<Character> newList = new ArrayList<>();

		// 1단계
		new_id = new_id.toLowerCase();

		// 2단계
		for (int i = 0; i < new_id.length(); i++) {
			if (new_id.charAt(i) >= 'a' && new_id.charAt(i) <= 'z') {
				list.add(new_id.charAt(i));
			} else if (new_id.charAt(i) >= '0' && new_id.charAt(i) <= '9') {
				list.add(new_id.charAt(i));
			} else if (new_id.charAt(i) == '-' || new_id.charAt(i) == '_' || new_id.charAt(i) == '.') {
				list.add(new_id.charAt(i));
			}
		}

		// 3단계
		char prev = list.get(0);
		newList.add(prev);
		int i = 0;

		while (i < list.size() - 1) {
			i++;
			char ch = list.get(i);

			if (ch == '.' && ch == prev) {
				continue;
			} else {
				newList.add(ch);
			}
			prev = ch;
		}

		// 4단계
		while (newList.size() >= 1 && (newList.get(0) == '.' || newList.get(newList.size() - 1) == '.')) {
			if (newList.get(0) == '.') {
				newList.remove(0);
			} else if (newList.get(newList.size() - 1) == '.') {
				newList.remove(newList.size() - 1);
			}
		}

		// 5단계
		if (newList.size() == 0) {
			newList.add('a');
		}

		// 6단계
		while (newList.size() >= 16) {
			newList.remove(newList.size() - 1);
		}

		while (newList.get(newList.size() - 1) == '.') {
			newList.remove(newList.size() - 1);
		}

		// 7단계
		while (newList.size() <= 2) {
			newList.add(newList.get(newList.size() - 1));
		}
		StringBuilder sb = new StringBuilder();

		for (i = 0; i < newList.size(); i++) {
			sb.append(newList.get(i));
		}

		return sb.toString();
	}
}
