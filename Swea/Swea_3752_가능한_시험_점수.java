package day210130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * Author   : 박정주
 * Date     : 2021-04-02
 * Level    : D4
 * URL      : https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWHPkqBqAEsDFAUn
 */
public class Swea_3752_가능한_시험_점수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] score = new int[N];
			int sum = 0;

			for (int i = 0; i < score.length; i++) {
				score[i] = Integer.parseInt(st.nextToken());
				sum += score[i];
			}
			int[] able = new int[sum + 1];
			able[0] = 1;

			for (int i = 0; i < N; i++) {
				for (int j = sum; j >= 0; j--) {
					if (able[j] == 1) {
						able[j + score[i]] = 1;
					}
				}
			}
			int count = 0;

			for (int i = 0; i <= sum; i++) {
				if (able[i] == 1) {
					count++;
				}
			}
			sb.append("#").append(tc).append(" ").append(count).append("\n");
		}
		System.out.println(sb.toString());
	}
}
