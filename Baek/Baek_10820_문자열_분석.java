package day210410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author   : 박정주 
 * Date     : 2021-04-10 
 * Category : 문자열
 * Level    : Bronze II
 * URL      : https://www.acmicpc.net/problem/10820
 */
public class Baek_10820_문자열_분석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = "";

		while ((line = br.readLine()) != null) {
			int upperCnt = 0;
			int lowerCnt = 0;
			int spaceCnt = 0;
			int numberCnt = 0;

			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);

				if (ch >= 'a' && ch <= 'z') {
					lowerCnt++;
				} else if (ch >= 'A' && ch <= 'Z') {
					upperCnt++;
				} else if (ch == ' ') {
					spaceCnt++;
				} else {
					numberCnt++;
				}
			}
			sb.append(lowerCnt).append(" ").append(upperCnt).append(" ").append(numberCnt).append(" ").append(spaceCnt)
					.append(" ").append("\n");
		}
		System.out.println(sb);
	}
}
