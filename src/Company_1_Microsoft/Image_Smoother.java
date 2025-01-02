package Company_1_Microsoft;
// https://leetcode.com/problems/image-smoother/description/
public class Image_Smoother {
    public static void main(String[] args) {
        int[][] ans = imageSmoother(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
    }
    public static int[][] imageSmoother(int[][] img) {
        int res[][] = new int[img.length][img[0].length];
        for(int i = 0; i < img.length; i++) {
            for(int j = 0; j < img[0].length; j++) {
                res[i][j] = check(img, i, j);
            }
        }
        return res;
    }
    static int check(int[][] img,int x,int y){
        int n = img.length;
        int m = img[0].length;

        int count = 0;
        int sum = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1 ; j++) {
                int a = i + x;
                int b = j + y;
                if(a < 0 || a >= n || b < 0 || b >= m) continue;
                sum += img[a][b];
                count++;
            }
        }
        return sum/count;
    }
}
