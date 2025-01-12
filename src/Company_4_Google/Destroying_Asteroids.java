package Company_4_Google;

import java.util.Arrays;

// https://leetcode.com/problems/destroying-asteroids/description/
public class Destroying_Asteroids {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long sum = mass;
        for(int ast : asteroids){
            if(sum >= ast){
                sum += ast;
            }else{
                return false;
            }
        }
        return true;
    }
}
