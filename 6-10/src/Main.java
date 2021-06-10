import java.util.Stack;

/**
 * @author: ShiShc
 * @desc:
 */
public class Main {
//    int collide(int[] numbers) {
//        int sum = 0;
//        for(int num : numbers) {
//            sum += num;
//        }
//
//        int target = sum >> 1;
//
//        int[] dp = new int[target + 1];
//
//        for(int i = 0;i < numbers.length;i ++) {
//            for(int j = target; j >= numbers[i];j --) {
//                dp[j] = Math.max(dp[j], dp[j - numbers[i]] + numbers[i]);
//            }
//        }
//
//        return sum - 2 * dp[target];
//    }

    String unwangdulize(String word) {
        StringBuilder stringBuilder = new StringBuilder();

        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();

        while(word.startsWith("anti") || word.startsWith("against") || word.startsWith("pre") || word.startsWith("re") || word.startsWith("un")) {
            if(word.startsWith("anti")) {
                stack.push("anti");
                word = word.substring(4);
            } else if(word.startsWith("post")) {
                stack.push("post");
                word = word.substring(4);
            } else if(word.startsWith("pre")) {
                stack.push("pre");
                word = word.substring(3);
            } else if(word.startsWith("re")) {
                stack.push("re");
                word = word.substring(2);
            } else if(word.startsWith("un")) {
                stack.push("un");
                word = word.substring(2);
            }
        }

        while(word.endsWith("er") || word.endsWith("ing") || word.endsWith("ize") || word.endsWith("tion") || word.endsWith("ful")) {
            if(word.endsWith("er")) {
                stack1.push("er");
                word = word.substring(0, word.length() - 2);
            } else if(word.endsWith("ing")) {
                stack1.push("ing");
                word = word.substring(0, word.length() - 3);
            } else if(word.endsWith("ize")) {
                stack1.push("ize");
                word = word.substring(0, word.length() - 3);
            } else if(word.endsWith("tion")) {
                stack1.push("tion");
                word = word.substring(0, word.length() - 4);
            } else if(word.endsWith("ful")) {
                stack1.push("ful");
                word = word.substring(0, word.length() - 3);
            }
        }

        stringBuilder.append(word);

        while(!stack1.isEmpty()) {
            String suffix = stack1.pop();
            switch (suffix) {
                case "er" : {
                    stringBuilder.insert(0, "one who ").append("s");
                    break;
                }
                case "ing" : {
                    stringBuilder.insert(0, "to actively ");
                    break;
                }
                case "ize" : {
                    stringBuilder.insert(0, "change into ");
                    break;
                }
                case "tion" : {
                    stringBuilder.insert(0, "the process of ").append("ing");
                    break;
                }
                case "ful" : {
                    stringBuilder.insert(0, "full of ");
                    break;
                }
            }
        }

        while(!stack.isEmpty()) {
            String prefix = stack.pop();
            switch (prefix) {
                case "anti":{
                    stringBuilder.insert(0, "against ");
                    break;
                }
                case "post":{
                    stringBuilder.insert(0, "after ");
                    break;
                }
                case "pre":{
                    stringBuilder.insert(0, "before ");
                    break;
                }
                case "re":{
                    stringBuilder.append(" again");
                    break;
                }
                case "un":{
                    stringBuilder.insert(0, "not ");
                    break;
                }
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Main().unwangdulize("unmodelize"));
//        System.out.println(new Main().collide(new int[]{1, 2, 1, 7, 9, 4}));
    }
}
