package day210410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author   : 박정주 
 * Date     : 2021-04-10
 * Category : 문자열
 * Level    : Bronze II
 * URL      : https://www.acmicpc.net/problem/10808
 */
public class Baek_10808_알파벳_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int[] alphabet = new int[26];

		for (int i = 0; i < str.length(); i++) {
			alphabet[str.charAt(i) - 'a']++;
		}

		for (int i = 0; i < alphabet.length; i++) {
			sb.append(alphabet[i]).append(" ");
		}
		System.out.println(sb);
	}
}
