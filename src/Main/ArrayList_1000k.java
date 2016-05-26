package Main;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class ArrayList_1000k {
    public static int count = 1000000;
    public static String volume = "1000k";


    public static void main(String[] args) {
        ImplementationForEachArrayListCase implementationForEachArrayListCase = new ImplementationForEachArrayListCase();

        ArrayList<Integer> arrayList = new ArrayList<>();
        ListIterator<Integer> listIterator = null;

        implementationForEachArrayListCase.implementation(volume, count, arrayList, listIterator);
    }
}
