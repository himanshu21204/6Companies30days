package Company_1_Microsoft;

import java.util.ArrayList;

// https://leetcode.com/problems/find-the-winner-of-the-circular-game/
public class Find_The_Winner_Of_The_Circular_Game {
    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            list.add(i);
        }

        int idx = 0;

        while(list.size() > 1){
            int nxtIdx = (idx + k - 1) % list.size();
            list.remove(nxtIdx);
            idx = nxtIdx;
        }
        return list.get(0);
    }
}

//public int findTheWinner(int n, int k) {
//    int winner=0;
//    for (int i = 1; i <= n; i++) {
//        winner = (winner + k) % i;
//    }
//    return winner + 1;
//}
// This is Every time Remove Exact Value