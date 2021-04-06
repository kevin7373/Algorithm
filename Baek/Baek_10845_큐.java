package day210406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Author   : 박정주 
 * Date     : 2021-04-06
 * Category : 큐
 * Level    : Silver IV
 * URL      : https://www.acmicpc.net/problem/10845
 */
public class Baek_10845_큐 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] queue = new int[N + 1];
		int front = -1;
		int rear = -1;

		for (int n = 1; n <= N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			switch (order) {
			case "push":
				int value = Integer.parseInt(st.nextToken());
				queue[++rear] = value;
				break;
			case "pop":
				if (front < rear) {
					sb.append(queue[++front]).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
			case "size":
				sb.append(rear - front).append("\n");
				break;
			case "empty":
				if (front < rear) {
					sb.append("0").append("\n");
				} else {
					sb.append("1").append("\n");
				}
				break;
			case "front":
				if (front < rear) {
					sb.append(queue[front + 1]).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
			case "back":
				if (front < rear) {
					sb.append(queue[rear]).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
			}
		}
		System.out.println(sb.toString());
	}
}
