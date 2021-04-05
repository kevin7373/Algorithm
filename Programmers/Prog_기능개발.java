package day210129;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author   : 박정주
 * Date     : 2021-01-29
 * Category : 스택 / 큐
 * Level    : Level 2
 */
public class Prog_기능개발 {
	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < progresses.length; i++) {
			int leftedWork = 100 - progresses[i];
			queue.add(leftedWork % speeds[i] == 0 ? leftedWork / speeds[i] : leftedWork / speeds[i] + 1);
		}
		List<Integer> list = new ArrayList<>();
		int prevWork = queue.poll();
		int cntWork = 1;

		while (!queue.isEmpty()) {
			int nowWork = queue.poll();

			if (prevWork < nowWork) {
				list.add(cntWork);
				cntWork = 1;
				prevWork = nowWork;
			} else {
				cntWork++;
			}
		}
		list.add(cntWork);
		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] progresses = { 90, 30, 55};
		int[] speeds = { 1, 30, 5 };

		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}
}
