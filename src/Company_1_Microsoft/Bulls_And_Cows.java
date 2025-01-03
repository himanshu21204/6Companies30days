package Company_1_Microsoft;
// https://leetcode.com/problems/bulls-and-cows
public class Bulls_And_Cows {
    public static void main(String[] args) {
        System.out.println(getHint("1123","0111"));
    }
    public static String getHint(String secret, String guess) {
        int[] temp = new int[10];
        int bulls = 0,cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            int x = secret.charAt(i) -'0';
            int y = guess.charAt(i) -'0';
            if(x == y){
                bulls++;
            }else{
                if(temp[x] < 0) cows++;
                if(temp[y] > 0) cows++;
                temp[x]++;
                temp[y]--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}
