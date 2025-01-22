package Company_6_Goldman_sachs;
// https://leetcode.com/problems/random-flip-matrix/description/
public class Random_Flip_Matrix {
    public static void main(String[] args) {
        Solution s = new Solution(3,1);
        System.out.println(s.flip());
        System.out.println(s.flip());
        System.out.println(s.flip());
        s.reset();
        System.out.println(s.flip());
    }
    static class Solution {
        int i = 0,j = 0;
        int m = 0,n = 0;
        public Solution(int m, int n) {
            m = this.m;
            n = this.n;
        }

        public int[] flip() {
            j++;
            if(j == this.n){
                j=0;
                i++;
            }
            if(i == this.m){
                i=0;
                j=0;
            }
            return new int[]{i,j};
        }

        public void reset() {

        }
    }
}
