package Company_6_Goldman_sachs;
// https://www.geeksforgeeks.org/problems/run-length-encoding/1
public class Run_Length_Encoding {
    public static void main(String[] args) {
        System.out.println(encode("abbbcddddg"));
    }
    public static String encode(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 1;
            while (i+1 < s.length() && ch == s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(ch).append(count);
        }
        return sb.toString();
    }
}
