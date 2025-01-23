package Company_5_Atlassian;
import java.util.*;
// https://leetcode.com/problems/find-beautiful-indices-in-the-given-array-i/
public class Find_Beautiful_Indices_In_The_Given_Array_I {
    public static void main(String[] args) {
        System.out.println(beautifulIndices("isawsquirrelnearmysquirrelhouseohmy","my","squirrel",15));
    }
    public static List<Integer> beautifulIndices(String s, String a, String b, int k) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        find(s,a,list1);
        find(s,b,list2);

        List<Integer> list = new ArrayList<>();
        for (int x : list1){
            for (int y : list2){
                if(Math.abs(x-y)<=k){
                    list.add(x);
                    break;
                }
            }
        }
        return list;
    }
    static void find(String s,String temp,ArrayList<Integer> list){
        int pos = s.indexOf(temp,0);
        if(pos == -1) return;

        while (pos != -1){
            list.add(pos);
            pos = s.indexOf(temp,pos + 1);
        }
    }
}
