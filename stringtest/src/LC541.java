/**
 * @author: ShiShc
 * @desc:
 */
public class LC541 {
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        for(int i = 0;i < s.length();i += (2 * k)) {
            if(i + k <= s.length()) {
                help(str, i, i + k - 1);
                continue;
            }
            help(str, i, str.length - 1);
        }

        return String.valueOf(str);
    }

    private void help(char[] str, int left, int right) {
        while(left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left ++;
            right --;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC541().reverseStr("abcdefg", 2));
    }
}
