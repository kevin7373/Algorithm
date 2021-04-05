package day210402;

/**
 * Author   : 박정주
 * Date     : 2021-04-02
 * Level    : Level 2
 */
public class Prog_스킬트리 {
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		int[] charArr = new int[26];

		for (int i = 0; i < skill.length(); i++) {
			charArr[skill.charAt(i) - 'A']++;
		}

		for (int i = 0; i < skill_trees.length; i++) {
			int skillIdx = 0;
			String skillTree = skill_trees[i];
			boolean flag = true;

			for (int j = 0; j < skillTree.length(); j++) {
				char nowSkill = skillTree.charAt(j);

				if (charArr[nowSkill - 'A'] == 0) {
					continue;
				} else if (skill.charAt(skillIdx) == skillTree.charAt(j)) {
					skillIdx++;
				} else {
					flag = false;
					break;
				}
			}

			if (flag) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };

		System.out.println(solution(skill, skill_trees));
	}
}
