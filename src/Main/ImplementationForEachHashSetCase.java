package Main;

import java.util.HashSet;

/**
 * Created by 7 on 26.05.2016.
 */
public class ImplementationForEachHashSetCase {
    public static void implementation (String volume, int count, HashSet<Integer> hashSet) {
        HashSetMethods hashSetMethods = new HashSetMethods();
        System.out.println("Time for each HashSet's method, with the volume " + volume + " : ");

        double timeForMethodAdd = hashSetMethods.hashSetAddTime(count, hashSet);
        System.out.println("Time for method .add(): " + timeForMethodAdd + "ms");

        double timeForMethodContains = hashSetMethods.hashSetListContainsTime(count, hashSet);
        System.out.println("Time for method .contains(): " + timeForMethodContains + "ms");

        double timeForMethodRemove = hashSetMethods.hashSetRemoveTime(count, hashSet);
        System.out.println("Time for method .remove(): " + timeForMethodRemove + "ms");

        double timeForMethodPopulate = hashSetMethods.hashSetPopulateTime(count, hashSet);
        System.out.println("Time for method .populate(): " + timeForMethodPopulate + "ms");
    }
}
