package Main;

import java.util.HashSet;

/**
 * Created by 7 on 26.05.2016.
 */
public class HashSet_100k {
    public static int count = 100000;
    public static String volume = "100k";


    public static void main(String[] args) {
        ImplementationForEachHashSetCase implementationForEachHashSetCase = new ImplementationForEachHashSetCase();

        HashSet<Integer> hashSet = new HashSet<>();

        implementationForEachHashSetCase.implementation(volume, count, hashSet);
    }
}
