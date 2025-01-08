package Company_2_Amazon;

import java.util.*;
// https://www.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1
public class Nuts_And_Bolts_Problem {
    void matchPairs(int n, char nuts[], char bolts[]) {
        String temp = "!#$%&*?@^";
        Set<Character> set = new HashSet<>();
        for (char ch : nuts){
            set.add(ch);
        }
        int i = 0;
        for (char ch : temp.toCharArray()){
            if(set.contains(ch)){
                nuts[i]=ch;
                bolts[i]=ch;
                i++;
            }
        }
        // System.out.println(Arrays.toString(nuts));
    }
}
