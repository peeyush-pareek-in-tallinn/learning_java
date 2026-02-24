package ee.peeyushlearningjava.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountFrequency {


    public static void main(String[] args) {

        List <String> list = Arrays.asList("ram", "shyam", "gita", "ram", "sita", "ram", "gita");
        System.out.println(Collections.frequency(list, "gita"));

    }

//    public static int countFrequency(List<String> list, String a) {
//
//        return Collections.frequency(list, a);
//
//    }
}
