package ee.peeyushlearningjava.Collections;

import java.util.*;

public class Comparator {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("ram");
//        list.add("shyam");
//        list.add("gita");
//        list.add("sita");

//        List <Integer> numList = new ArrayList<>();
//        numList.add(4);
//        numList.add(6);
//        numList.add(2);
//        numList.add(-8);

        List<String> list = Arrays.asList("ram", "shyam", "gita", "sita");
        List<Integer> numList = Arrays.asList(4, 6, 2, -8);

        System.out.println(list);
        System.out.println(numList);

        sortStrInDescending(list);
        sortNumInDescending(numList);

        System.out.println(list);
        System.out.println(numList);

    }
    public static void sortNumInDescending(List<Integer> numList) {
//        Collections.sort(numList);
//        Collections.reverse(numList);

        Collections.sort(numList, (a, b) -> a.compareTo(b));
//        Collections.sort(numList, (a, b) -> b.compareTo(a));
    }

    public static void sortStrInDescending(List<String> strList) {
//        Collections.sort(strList);
//        Collections.reverse(strList);
//        Collections.sort(strList, (a, b) -> a.compareTo(b));
        Collections.sort(strList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });

    }
}
