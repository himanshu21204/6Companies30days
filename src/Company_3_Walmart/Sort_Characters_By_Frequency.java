package Company_3_Walmart;

import java.util.Arrays;
import java.util.PriorityQueue;

// https://leetcode.com/problems/sort-characters-by-frequency/description/
public class Sort_Characters_By_Frequency {
    public String frequencySort(String s) {
        int[] temp = new int[128]; // Since ASCII has 128 characters
        for (char c : s.toCharArray()) {
            temp[c]++;
        }
        Character[] chars = new Character[128];
        for (int i = 0; i < 128; i++) {
            chars[i] = (char) i;
        }
        Arrays.sort(chars, (a, b) -> temp[b] - temp[a]);
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (temp[c] > 0) {
                sb.append(String.valueOf(c).repeat(Math.max(0, temp[c])));
            }
        }
        return sb.toString();
    }
}
