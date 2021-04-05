package day210128;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Category : 완전 탐색
 * Level    : Level 1
 */
public class Prog_모의고사_old {
	public static class Score implements Comparable<Score> {
		private int student;
		private int score;

		Score(int student, int score) {
			this.student = student;
			this.score = score;
		}

		@Override
		public int compareTo(Score o) {
			if (this.score < o.score) {
				return 1;
			} else if (this.score > o.score) {
				return -1;
			} else {
				if (this.student < o.student) {
					return -1;
				} else if (this.student > o.student) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };

		System.out.println(solution(answers));
	}

	public static List<Integer> solution(int[] answers) {
		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		List<Score> score = new ArrayList<>(Arrays.asList(new Score(1, 0), new Score(2, 0), new Score(3, 0)));
		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == one[i % one.length]) {
				score.get(0).score++;
			}

			if (answers[i] == two[i % two.length]) {
				score.get(1).score++;
			}

			if (answers[i] == three[i % three.length]) {
				score.get(2).score++;
			}
		}
		Collections.sort(score);
		int max = score.get(0).score;
		answer.add(score.get(0).student);

		for (int i = 1; i < score.size(); i++) {
			if (max == score.get(i).score) {
				answer.add(score.get(i).student);
			}
		}

		return answer;
	}
}
