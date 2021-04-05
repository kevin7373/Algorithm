package day210402;

/**
 * Author   : 박정주
 * Date     : 2021-04-02
 * Level    : Level 2
 */
public class Prog_예상_대진표 {
	public static int solution(int n, int a, int b) {
		int answer = 1;
		
		for (int i = 0; i < n; i++) {
			a = a % 2 == 0 ? a / 2 : a / 2 + 1;
			b = b % 2 == 0 ? b / 2 : b / 2 + 1;
			
			if (a == b) {
				break;
			}
			answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 8;
		int a = 4;
		int b = 7;

		System.out.println(solution(n, a, b));
	}
}
