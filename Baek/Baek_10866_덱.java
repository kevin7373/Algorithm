package day210409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Author   : 박정주 
 * Date     : 2021-04-09
 * Category : 덱
 * Level    : Silver IV
 * URL      : https://www.acmicpc.net/problem/10866
 */
public class Baek_10866_덱 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] deque = new int[N];
		int front = N / 2;
		int rear = N / 2;
		int value = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();

			switch (order) {
			case "push_front":
				value = Integer.parseInt(st.nextToken());
				deque[--front] = value;
				break;
			case "push_back":
				value = Integer.parseInt(st.nextToken());
				deque[rear++] = value;
				break;
			case "pop_front":
				if (front == rear) {
					sb.append("-1").append("\n");
				} else {
					sb.append(deque[front++]).append("\n");
				}
				break;
			case "pop_back":
				if (front == rear) {
					sb.append("-1").append("\n");
				} else {
					sb.append(deque[--rear]).append("\n");
				}
				break;
			case "size":
				sb.append(rear - front).append("\n");
				break;
			case "empty":
				if (front == rear) {
					sb.append("1").append("\n");
				} else {
					sb.append("0").append("\n");
				}
				break;
			case "front":
				if (front == rear) {
					sb.append("-1").append("\n");
				} else {
					sb.append(deque[front]).append("\n");
				}
				break;
			case "back":
				if (front == rear) {
					sb.append("-1").append("\n");
				} else {
					sb.append(deque[rear - 1]).append("\n");
				}
				break;
			}
		}
		System.out.println(sb);
	}
}