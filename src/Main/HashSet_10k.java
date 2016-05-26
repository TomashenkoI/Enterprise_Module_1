package Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class HashSet_10k {
    public static int count = 10000;
    public static String volume = "10k";


    public static void main(String[] args) {
        ImplementationForEachHashSetCase implementationForEachHashSetCase = new ImplementationForEachHashSetCase();

        HashSet<Integer> hashSet = new HashSet<>();

        implementationForEachHashSetCase.implementation(volume, count, hashSet);
    }
}
