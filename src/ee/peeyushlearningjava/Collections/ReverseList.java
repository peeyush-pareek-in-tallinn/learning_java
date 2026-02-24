package ee.peeyushlearningjava.Collections;

import java.util.List;
import java.util.Arrays;

public class ReverseList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,6,8);
//        List <String> nameList = Arrays.asList("ram", "shyam", "gita", "ram", "sita", "ram", "gita");
        System.out.println(list);
//        List<Integer> revList = list.reversed();
//        System.out.println(revList);

//        List<Integer> revList = list.reversed();
//        Collections.reverse(list);
        reverse(list);
//        System.out.println(revList);

        System.out.println(list);
    }

    public static void reverse (List<Integer> list) {

        for (int i = 0; i < list.size() / 2; i++) {
//            int temp = list.get(i);
//            list.set(i, list.get(list.size() - i -1));
//            list.set((list.size() - i -1), temp);

        SwapElementsInAnArray.swap(list, i, list.size() - i - 1);

//            int i = 0;
//            while (i < list.size()/2) {
//                int temp = list.get(i);
//                list.set(i, list.get(list.size() - i - 1));
//                list.set(list.size() - i - 1, temp);
//                i++;
            }
    }
}
