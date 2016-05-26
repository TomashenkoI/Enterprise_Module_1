package Main;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class ImplementationForEachLinkedListCase {
    public static void implementation (String volume, int count, LinkedList<Integer> linkedList, ListIterator<Integer> listIterator) {
        LinkedListMethods linkedListMethods = new LinkedListMethods();
        System.out.println("Time for each LinkedList's method, with the volume " + volume + " : ");

        double timeForMethodAdd = linkedListMethods.linkedListAddTime(count, linkedList);
        System.out.println("Time for method .add(): " + timeForMethodAdd + "ms");

        double timeForMethodGet = linkedListMethods.linkedListGetTime(count, linkedList);
        System.out.println("Time for method .get(): " + timeForMethodGet + "ms");

        double timeForListIteratorAdd = linkedListMethods.linkedListIteratorAddTime(count, linkedList, listIterator);
        System.out.println("Time for method ListIterator .add(): " + timeForListIteratorAdd + "ms");

        double timeForListIteratorRemove = linkedListMethods.linkedListIteratorRemoveTime(count, linkedList, listIterator);
        System.out.println("Time for method ListIterator .remove(): " + timeForListIteratorRemove + "ms");

        double timeForMethodContains = linkedListMethods.linkedListContainsTime(count, linkedList);
        System.out.println("Time for method .contains(): " + timeForMethodContains + "ms");

        double timeForMethodRemove = linkedListMethods.linkedListRemoveTime(count, linkedList);
        System.out.println("Time for method .remove(): " + timeForMethodRemove + "ms");

        double timeForMethodPopulate = linkedListMethods.linkedListPopulateTime(count, linkedList);
        System.out.println("Time for method .populate(): " + timeForMethodPopulate + "ms");
    }
}
