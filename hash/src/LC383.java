import java.util.HashMap;
import java.util.Map;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> dic = new HashMap<>();

        for(int i = 0;i < ransomNote.length();i ++) {
            int temp = dic.getOrDefault(ransomNote.charAt(i), 0);
            dic.put(ransomNote.charAt(i), temp + 1);
        }

        for(int i = 0;i < magazine.length();i ++) {
            if(dic.containsKey(magazine.charAt(i))) {
                int temp = dic.get(magazine.charAt(i));
                dic.put(magazine.charAt(i), temp - 1);
                if(temp == 1) {
                    dic.remove(magazine.charAt(i));
                }
            }
        }

        for(Map.Entry<Character, Integer> entry : dic.entrySet()) {
            if(entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
