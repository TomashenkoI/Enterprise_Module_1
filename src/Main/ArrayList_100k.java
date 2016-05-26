package Main;

import java.util.*;

/**
 * Created by 7 on 25.05.2016.
 */
public class ArrayList_100k {
    public static int count = 100000;
    public static String volume = "100k";


    public static void main(String[] args) {
        ImplementationForEachArrayListCase implementationForEachArrayListCase = new ImplementationForEachArrayListCase();

        ArrayList<Integer> arrayList = new ArrayList<>();
        ListIterator<Integer> listIterator = null;

        implementationForEachArrayListCase.implementation(volume, count, arrayList, listIterator);
    }
}
