package day210402;

import java.util.ArrayList;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Level    : Level 1
 */
public class Prog_폰켓몬 {
	public static int solution(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(nums[0]);

		for (int i = 1; i < nums.length; i++) {
			if (list.contains(nums[i])) {
				continue;
			}
			list.add(nums[i]);
		}
		int answer = list.size() < nums.length / 2 ? list.size() : nums.length / 2;

		return answer;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };

		System.out.println(solution(nums));
	}
}
