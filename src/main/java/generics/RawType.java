package generics;

import java.util.HashMap;

public class RawType {

    public static void main(String[] args) {
        HashMap hm = new HashMap(); // Raw Datatype
        hm.put(1, "Nik");
        hm.put(4.5, 7.2);

        int i = (Integer) hm.get(1);

        System.out.println(i);
    }
}
