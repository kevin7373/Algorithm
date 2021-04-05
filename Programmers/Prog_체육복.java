package day210128;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Category : 그리디
 * Level    : Level 1
 */
public class Prog_체육복 {
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] student = new int[n + 1];

		for (int i = 0; i < lost.length; i++) {
			student[lost[i]]--;
		}

		for (int i = 0; i < reserve.length; i++) {
			student[reserve[i]]++;
		}

		for (int i = 1; i < n; i++) {
			if (student[i] == -1) {
				if (student[i - 1] == 1) {
					student[i - 1]--;
					student[i]++;
				} else if (student[i + 1] == 1) {
					student[i + 1]--;
					student[i]++;
				}
			}
		}

		for (int i = 1; i < student.length; i++) {
			if (student[i] >= 0) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 1, 2 };
		int[] reserve = { 2, 3 };

		System.out.println(solution(n, lost, reserve));
	}
}
