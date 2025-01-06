package Company_2_Amazon;
// https://leetcode.com/problems/longest-mountain-in-array/description/
public class Longest_Mountain_In_Array {
    public static void main(String[] args) {
        System.out.println(longestMountain(new int[]{0,1,0}));
    }
    public static int longestMountain(int[] arr) {
        if(arr.length < 2) return 0;

        int len = arr.length;
        // Find Peak Point
        // Peak Point not be 1 and n-1 bcz that not become mountain
        int ans = 0;
        for (int i = 1; i <= len-2;) {

            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                int count = 1;
                int idx = i;
                while (idx > 0 && arr[idx] > arr[idx - 1]){
                    count++;
                    idx--;
                }
                while (i < len-1 && arr[i] > arr[i + 1]){
                    i++;
                    count++;
                }
                ans = Math.max(ans,count);
            }else{
                i++;
            }
        }
        return ans;
    }
}
