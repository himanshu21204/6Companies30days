package Company_5_Atlassian;

public class Count_Collisions_On_A_Road {
    public int countCollisions(String directions) {
        int res = 0, n = directions.length(), i = 0, right = 0;
        while (i < n && directions.charAt(i) == 'L') i++;
        for ( ; i<n; i++) {
            if (directions.charAt(i) == 'R')  right++;
            else {
                res += (directions.charAt(i) == 'S') ? right : right+1;
                right = 0;
            }
        }
        return res;
    }
}
