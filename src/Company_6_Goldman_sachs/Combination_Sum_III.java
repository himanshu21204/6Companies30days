package Company_6_Goldman_sachs;
import java.util.*;
public class Combination_Sum_III {
    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        find(ans, new ArrayList<Integer>(), k, 1, n);
        return ans;
    }
    private static void find(List<List<Integer>> ans, List<Integer> temp, int k,  int start, int n) {
        if (temp.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(temp);
            ans.add(li);
            return;
        }
        for (int i = start; i <= 9; i++) {
            temp.add(i);
            find(ans, temp, k, i+1, n-i);
            temp.remove(temp.size() - 1);
        }
    }
}
