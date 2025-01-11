package Company_6_Goldman_sachs;

import java.util.ArrayList;
import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
public class Missing_And_Repeating {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int[] freq = new int[n+1];
        for (int j : arr) {
            freq[j]++;
        }
        int rep=-1;
        int miss=-1;
        for(int i=1; i<=n; i++){
            if(freq[i]==2){
                rep=i;
            }
            else if(freq[i]==0){
                miss=i;
            }
        }
        list.add(rep);
        list.add(miss);
        return list;
    }

    // User function Template for Java
    int[] findTwoElement2(int arr[]) {
        cyclicSort(arr);
        for(int i=0;i<arr.length;i++){
            if((i+1)!=arr[i]){
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length) {
            int current = arr[i] - 1;
            if(arr[i] != arr[current]){
                int temp = arr[current];
                arr[current] = arr[i];
                arr[i] = temp;
            } else{
                i++;
            }
        }
    }
}
