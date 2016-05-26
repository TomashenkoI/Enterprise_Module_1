package Main;

import java.util.TreeSet;

/**
 * Created by 7 on 26.05.2016.
 */
public class ImplementationForEachTreeSetCase {
    public static void implementation (String volume, int count, TreeSet<Integer> TreeSet) {
        TreeSetMethods treeSetMethods = new TreeSetMethods();
        System.out.println("Time for each TreeSet's method, with the volume " + volume + " : ");

        double timeForMethodAdd = treeSetMethods.treeSetAddTime(count, TreeSet);
        System.out.println("Time for method .add(): " + timeForMethodAdd + "ms");

        double timeForMethodContains = treeSetMethods.treeSetContainsTime(count, TreeSet);
        System.out.println("Time for method .contains(): " + timeForMethodContains + "ms");

        double timeForMethodRemove = treeSetMethods.treeSetRemoveTime(count, TreeSet);
        System.out.println("Time for method .remove(): " + timeForMethodRemove + "ms");

        double timeForMethodPopulate = treeSetMethods.treeSetPopulateTime(count, TreeSet);
        System.out.println("Time for method .populate(): " + timeForMethodPopulate + "ms");
    }
}
