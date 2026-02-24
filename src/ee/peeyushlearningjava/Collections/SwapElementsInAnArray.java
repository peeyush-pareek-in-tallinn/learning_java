package ee.peeyushlearningjava.Collections;

import java.util.ArrayList;
import java.util.List;

public class SwapElementsInAnArray {

    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(9);

        List <Integer> secList;

        System.out.println(list);
//        Collections.swap(list, 0, 2);
        swap(list, 0, 2);
        System.out.println(list);
//        System.out.println(swap(list, 0, 2));
    }

    public static void swap (List<Integer> array, int a, int b) {

//        List<Integer> copyList = new ArrayList<>(array);
//        int temp = copyList.get(a);
//        copyList.set(a, copyList.get(b));
//        copyList.set(b, temp);

        int temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);

//        System.out.println(array);

//        return array;

    }
}
