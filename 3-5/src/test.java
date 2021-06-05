import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/5, 19:42
 * @Auther:ShiShc
 */

public class test {
    public static int hashCode2(String s) {
        int h = 0;
        if (h == 0 && s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                h = 31 * h + s.charAt(i);
            }
        }
        return h;
    }

    public static int hash(Object key) {
        int h;
       return ((h = key.hashCode()) ^ (h >>> 16));
    }


    public static void main(String[] args) {
//        String abc = new String("abc");
//        System.out.println(abc.hashCode());
//        System.out.println(hashCode2("abc"));
//        System.out.println(hash("abc"));
//
//        System.out.println((int) 'a');

        String a;

        System.out.println(Objects.hashCode('a'));
        System.out.println((a = "a").hashCode());


//        System.out.println((int)'a');
//
//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuffer stringBuffer = new StringBuffer();
//        Object obj = new Object();
//        System.out.println(obj.toString());
    }
}
