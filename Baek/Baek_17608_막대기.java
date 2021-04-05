package day210403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * Author   : 박정주
 * Date     : 2021-04-03
 * Category : 스택 / 큐
 * Level    : Bronze II
 * URL      : https://www.acmicpc.net/problem/17608
 */
public class Baek_17608_막대기 {
	public static int solution(int[] stickArr) {
		int answer = 1;
		int height = stickArr[stickArr.length - 1];
		
		for (int i = stickArr.length - 1; i >= 0; i--) {
			if (height < stickArr[i]) {
				answer++;
				height = stickArr[i];
			}
		}
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] stickArr = new int[N];
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			stickArr[i] = n;
		}
		System.out.println(solution(stickArr));
	}
}
