package Main;

import java.util.TreeSet;

/**
 * Created by 7 on 26.05.2016.
 */
public class TreeSet_1000k {
    public static int count = 1000000;
    public static String volume = "1000k";


    public static void main(String[] args) {
        ImplementationForEachTreeSetCase implementationForEachTreeSetCase = new ImplementationForEachTreeSetCase();

        TreeSet<Integer> treeSet = new TreeSet<>();

        implementationForEachTreeSetCase.implementation(volume, count, treeSet);
    }
}