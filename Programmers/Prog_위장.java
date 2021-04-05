package day210128;

import java.util.HashMap;
import java.util.Set;

/**
 * Author   : 박정주
 * Date     : 2021-01-28
 * Category : 해시
 * Level    : Level 2
 */
public class Prog_위장 {
	public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < clothes.length; i++) {
			String key = clothes[i][1];

			if (!hm.containsKey(key)) {
				hm.put(key, 1);
			} else {
				hm.put(key, hm.get(key) + 1);
			}
		}
		Set<String> keySet = hm.keySet();

		for (String key : keySet) {
			answer *= hm.get(key) + 1;
		}
		return answer - 1;
	}

	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };

		System.out.println(solution(clothes));
	}
}
