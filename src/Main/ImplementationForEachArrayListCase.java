package Main;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class ImplementationForEachArrayListCase {

    public static void implementation (String volume, int count, ArrayList<Integer> arrayList, ListIterator<Integer> listIterator) {
        ArrayListMethods arrayListMethods = new ArrayListMethods();
        System.out.println("Time for each ArrayList's method, with the volume " + volume + " : ");

        double timeForMethodAdd = arrayListMethods.arrayListAddTime(count, arrayList);
        System.out.println("Time for method .add(): " + timeForMethodAdd + "ms");

        double timeForListIteratorAdd = arrayListMethods.arrayListIteratorAddTime(count, arrayList, listIterator);
        System.out.println("Time for method ListIterator .add(): " + timeForListIteratorAdd + "ms");

        double timeForListIteratorRemove = arrayListMethods.arrayListIteratorRemoveTime(count, arrayList, listIterator);
        System.out.println("Time for method ListIterator .remove(): " + timeForListIteratorRemove + "ms");

        double timeForMethodGet = arrayListMethods.arrayListGetTime(count, arrayList);
        System.out.println("Time for method .get(): " + timeForMethodGet + "ms");

        double timeForMethodContains = arrayListMethods.arrayListContainsTime(count, arrayList);
        System.out.println("Time for method .contains(): " + timeForMethodContains + "ms");

        double timeForMethodRemove = arrayListMethods.arrayListRemoveTime(count, arrayList);
        System.out.println("Time for method .remove(): " + timeForMethodRemove + "ms");
    }

}
