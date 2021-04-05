package day210128;

import java.util.*;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Level    : Level 1
 */
public class Prog_두개뽑아서더하기 {
	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };

		System.out.println(solution(numbers));
	}

	public static List<Integer> solution(int[] numbers) {
		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				hs.add(numbers[i] + numbers[j]);
			}
		}
		List<Integer> list = new ArrayList<>(hs);
		Collections.sort(list);

		return list;
	}
}
