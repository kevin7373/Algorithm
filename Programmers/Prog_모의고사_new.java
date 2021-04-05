package day210128;

import java.util.ArrayList;
import java.util.List;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Category : 완전 탐색
 * Level    : Level 1
 */
public class Prog_모의고사_new {
	public static void main(String[] args) {
		int[] answers = { 1, 3, 2, 4, 2, 1 };

		System.out.println(solution(answers));
	}

	public static List<Integer> solution(int[] answers) {
		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		List<Integer> answer = new ArrayList<>();
		int[] score = new int[4];

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == one[i % one.length]) {
				score[1]++;
			}

			if (answers[i] == two[i % two.length]) {
				score[2]++;
			}

			if (answers[i] == three[i % three.length]) {
				score[3]++;
			}
		}
		int max = Math.max(Math.max(score[1], score[2]), score[3]);

		for (int i = 1; i < score.length; i++) {
			if (max == score[i]) {
				answer.add(i);
			}
		}

		return answer;
	}
}
