package Company_1_Microsoft;
// https://leetcode.com/problems/circle-and-rectangle-overlapping/
// Help Use:https://leetcode.com/problems/circle-and-rectangle-overlapping/solutions/4523344/trying-to-explain-with-diagram/
public class Circle_And_Rectangle_Overlapping {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int nearX = Math.max(x1,Math.min(x2,xCenter));
        int nearY = Math.max(y1,Math.min(y2,yCenter));

        int distanceX = xCenter - nearX;
        int distanceY = yCenter - nearY;

        return (distanceY * distanceY + distanceX * distanceX) <= radius * radius;
    }
}
