package Company_2_Amazon;
import java.util.*;
// https://leetcode.com/problems/find-number-of-ways-to-reach-the-k-th-stair/description/
public class Find_Number_Of_Ways_To_Reach_The_K_Th_Stair {
    private Map<String, Integer> map;

    int rec(int curr, int j, int k, int flag) {
        if(curr-k > 1) return 0;

        String key = (curr+""+j+""+flag);
        if(map.containsKey(key)) return map.get(key);

        int ct = curr==k? 1: 0;
        if(flag==1 && curr>0){
            ct += rec(curr-1, j, k, 0);
        }
        ct += rec(curr+(1<<j), j+1, k, 1);

        map.put(key, ct);
        return ct;
    }

    public int waysToReachStair(int k) {
        map = new HashMap<>();
        return rec(1, 0, k, 1);
    }
}
