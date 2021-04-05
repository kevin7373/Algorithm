package day210405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * Author   : 박정주 
 * Date     : 2021-04-05 
 * Category : 그리디
 * Level    : Silver III
 * URL      : https://www.acmicpc.net/problem/11399
 */
public class Baek_11399_ATM {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] memo = new int[N];
		int[] times = new int[N];
		int answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(times);
		memo[0] = times[0];
		
		for (int i = 1; i < N; i++) {
			memo[i] = times[i] + memo[i - 1];
		}
		
		for (int i = 0; i < N; i++) {
			answer += memo[i];
		}
		System.out.println(answer);
	}
}
