package Company_6_Goldman_sachs;

import java.util.*;
// ## Not Work code for all test case
public class Minimize_The_Maximum_Of_Two_Arrays {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        int i = 1;
        while (set1.size() < uniqueCnt1 || set2.size() < uniqueCnt2) {
            if (i % divisor1 != 0 && !set2.contains(i) && set1.size() < uniqueCnt1) {
                set1.add(i);
            } else if (i % divisor2 != 0 && !set1.contains(i) && set2.size() < uniqueCnt2) {
                set2.add(i);
            }
            i++;
        }

        return i - 1;
    }
}
