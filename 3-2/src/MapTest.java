import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/2, 22:43
 * @Auther:ShiShc
 */

public class MapTest {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("1","Hello");
        map.put("2","World");
        map.put("3","Hi");

        for(String key:map.keySet()) {
            System.out.println("key = " + key + ", value = " + map.get(key));
        }

        System.out.println("-------------");


        /**
         * Map.Entry是Map声明接口的一个内部接口，此接口为泛型，定义为Entry<K, V>. 他表示Map中的一个实体。
         */
        Iterator<Map.Entry<String, String>> ite = map.entrySet().iterator();
        while(ite.hasNext()) {
            Map.Entry<String, String> entry = ite.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }

        System.out.println("-------------");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }

        System.out.println("-------------");

        for(String s : map.values()) {
            System.out.println("value = " + s);
        }

    }
}
