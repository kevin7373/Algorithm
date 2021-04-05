package day210403;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Author   : 박정주
 * Date     : 2021-04-03
 * Category : 정렬
 * Level    : Level 2
 */
public class Prog_가장큰수 {
	public static String solution(int[] numbers) {
		StringBuilder answer = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			list.add(Integer.toString(numbers[i]));
		}

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -(o1 + o2).compareTo(o2 + o1);
			}
		});

		if (list.get(0).equals("0")) {
			return "0";
		}

		for (String str : list) {
			answer.append(str);
		}
		return answer.toString();
	}

	public static void main(String[] args) {
		int[] numbers = { 0, 0, 0 };

		System.out.println(solution(numbers));
	}
}
