package Company_2_Amazon;
// https://leetcode.com/problems/first-unique-character-in-a-string/
public class First_Unique_Character_In_A_String {
    public int firstUniqChar(String s) {
        int[]freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
