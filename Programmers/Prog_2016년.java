package day210128;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Level    : Level 1
 */
public class Prog_2016년 {
	public static String solution(int a, int b) {
		String answer = "";
		Integer[] dayOfMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] dayOfWeek = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int days = -1;

		for (int i = 0; i < a - 1; i++) {
			days += dayOfMonth[i];
		}
		days += b;
		answer = dayOfWeek[(days + 5) % 7];

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(5, 24));
	}
}
