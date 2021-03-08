import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/8, 11:13
 * @Auther:ShiShc
 */

public class MyTest {
    public static void main(String[] args) {

        HashMap<Object, Object> map = new HashMap<>();


        int x;
        System.out.println((x = 3) == 4);

        //        ArrayList<Object> list = new ArrayList<>();
//
//        list.add("a");
//        list.add("b");
//        list.add("c");

//        Iterator<Object> iterator = list.iterator();
//        for(; iterator.hasNext(); ) {
//            System.out.println(iterator.next());
//        }
//
//
//        int capacity1 = 10;
//        int capacity2 = 9;
//
//        capacity1 = capacity1 + (capacity1 >> 1);
//        capacity2 = capacity2 + (capacity2 >> 1);
//
//        System.out.println(capacity1);
//        System.out.println(capacity2);
//
//
//        Vector<Object> vector = new Vector<>();

//
//        List<Object> list1 = Collections.synchronizedList(list);
//        System.out.println(list1.getClass());
//
//        for(Iterator iterator = list1.iterator(); iterator.hasNext();) {
//            System.out.println(iterator.next());
//        }
//
//        CopyOnWriteArrayList<Object> objects = new CopyOnWriteArrayList<>();

        ConcurrentHashMap<Object, Object> map1 = new ConcurrentHashMap<>();

    }
}
