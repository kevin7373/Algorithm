package day210128;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Category : 정렬
 * Level    : Level 1
 */
public class Prog_K번째수_old {
	public static List<Integer> solution(int[] array, int[][] commands) {
		List<Integer> answer = new ArrayList<>();

		for (int[] command : commands) {
			int i = command[0];
			int j = command[1];
			int k = command[2];

			List<Integer> list = new ArrayList<>();

			for (int ii = i - 1; ii < j; ii++) {
				list.add(array[ii]);
			}
			Collections.sort(list);
			answer.add(list.get(k - 1));
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		System.out.println(solution(array, commands));
	}
}
