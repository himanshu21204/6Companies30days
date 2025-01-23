package Company_3_Walmart;
// https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
public class Verify_Preorder_Serialization_Of_A_Binary_Tree {
    public boolean isValidSerialization(String preorder) {
        int temp = 1;
        String[] pre = preorder.split(",");

        for (String str : pre){
            temp -= 1;
            if(temp < 0) return false;
            if(!str.equals("#")) temp+=2;
        }
        return temp == 0;
    }
}
