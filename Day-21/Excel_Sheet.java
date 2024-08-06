public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--;  // Adjust for 1-based indexing
            char ch = (char) (columnNumber % 26 + 'A');
            str.insert(0, ch);
            columnNumber /= 26;
        }
        
        return str.toString();
    }
}
