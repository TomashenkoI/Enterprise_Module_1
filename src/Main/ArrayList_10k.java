package Main;

import java.util.*;

/**
 * Created by 7 on 25.05.2016.
 */
public class ArrayList_10k {
    public static int count = 10000;
    public static String volume = "10k";
    public static ImplementationForEachArrayListCase implementationForEachArrayListCase = new ImplementationForEachArrayListCase();
    public static ArrayListMethods  arrayListMethods = new ArrayListMethods();
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static ListIterator<Integer> listIterator = null;

    public static void main(String[] args) {


        implementationForEachArrayListCase.implementation(volume, count, arrayList, listIterator);
    }

    public static String arrayListAdd_10k () {
        return String.valueOf(arrayListMethods.arrayListAddTime(count, arrayList));
    }
}
