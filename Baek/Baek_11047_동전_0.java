package day210405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Author   : 박정주 
 * Date     : 2021-04-05 
 * Category : 그리디
 * Level    : Silver II
 * URL      : https://www.acmicpc.net/problem/11047
 */
public class Baek_11047_동전_0 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coins = new int[N + 1];
		int answer = 0;

		for (int n = 1; n <= N; n++) {
			coins[n] = Integer.parseInt(br.readLine());
		}

		for (int i = N; i >= 1; i--) {
			if (K >= coins[i]) {
				answer += (K / coins[i]);
				K -= (K / coins[i]) * coins[i];
			}
		}
		System.out.println(answer);
	}
}
