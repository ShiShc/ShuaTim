/**
 * @author: ShiShc
 * @desc:
 */
public class LC151 {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder result = new StringBuilder();

        int temp;
        for(int index = s.length() - 1; index >= 0;) {
            temp = index;
            while(index >= 0 && s.charAt(index) != ' ') index --;
            result.append(s.substring(index + 1, temp + 1)).append(" ");
            while(index >= 0 && s.charAt(index) == ' ') index --;
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new LC151().reverseWords("the sky is   blue "));
    }
}
