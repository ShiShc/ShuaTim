/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/22, 21:30
 * @Auther:ShiShc
 */

public class MyHeapTest {
    public static void main(String[] args) {
        long total = Runtime.getRuntime().totalMemory();
        long max = Runtime.getRuntime().maxMemory();

        System.out.println("total : " + total + " About " + total/(double)(1024*1024));
        System.out.println("max : " + max + " About " + max/(double)(1024*1024));
    }
}
