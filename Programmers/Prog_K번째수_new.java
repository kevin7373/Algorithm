package day210128;

import java.util.Arrays;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Category : 정렬
 * Level    : Level 1
 */
public class Prog_K번째수_new {
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right) / 2];

		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
				left++;
				right--;
			}
		}
		return left;
	}

	public static void sort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		// int mid = partition(arr, left, right);
		int pl = left;
		int pr = right;
		int mid = arr[(left + right) / 2];

		while (pl <= pr) {
			while (arr[pl] < mid) {
				pl++;
			}

			while (arr[pr] > mid) {
				pr--;
			}

			if (pl <= pr) {
				int tmp = arr[pl];
				arr[pl] = arr[pr];
				arr[pr] = tmp;
				pl++;
				pr--;
			}
		}

		sort(arr, left, pr);
		sort(arr, pl, right);
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int jj = 0;

		for (int[] command : commands) {
			int i = command[0];
			int j = command[1];
			int k = command[2];

			int[] arr = new int[j - i + 1];

			for (int ii = 0; ii < arr.length; ii++) {
				arr[ii] = array[i - 1];
				i++;
			}
			sort(arr, 0, arr.length - 1);

			answer[jj] = arr[k - 1];
			jj++;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		System.out.println(Arrays.toString(solution(array, commands)));
	}
}
