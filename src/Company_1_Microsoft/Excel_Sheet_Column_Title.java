package Company_1_Microsoft;
// https://leetcode.com/problems/excel-sheet-column-title/description/
public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            char ch = (char) (remainder + 'A');
            sb.insert(0,ch);
            columnNumber = columnNumber / 26;
        }
        return sb.toString();
    }
}
