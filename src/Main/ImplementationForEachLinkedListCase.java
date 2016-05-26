package Main;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class ImplementationForEachLinkedListCase {
    public static void implementation (String volume, int count, LinkedList<Integer> linkedList, ListIterator<Integer> listIterator) {
        LinkedListMethods linkedListMethods = new LinkedListMethods();
        System.out.println("Time for each ArrayList's method, with the volume " + volume + " : ");

        double timeForMethodAdd = linkedListMethods.arrayListAddTime(count, linkedList);
        System.out.println("Time for method .add(): " + timeForMethodAdd + "ms");

        double timeForListIteratorAdd = linkedListMethods.arrayListIteratorAddTime(count, linkedList, listIterator);
        System.out.println("Time for method ListIterator .add(): " + timeForListIteratorAdd + "ms");

        double timeForListIteratorRemove = linkedListMethods.arrayListIteratorRemoveTime(count, linkedList, listIterator);
        System.out.println("Time for method ListIterator .remove(): " + timeForListIteratorRemove + "ms");

        double timeForMethodGet = linkedListMethods.arrayListGetTime(count, linkedList);
        System.out.println("Time for method .get(): " + timeForMethodGet + "ms");

        double timeForMethodContains = linkedListMethods.arrayListContainsTime(count, linkedList);
        System.out.println("Time for method .contains(): " + timeForMethodContains + "ms");

        double timeForMethodRemove = linkedListMethods.arrayListRemoveTime(count, linkedList);
        System.out.println("Time for method .remove(): " + timeForMethodRemove + "ms");
    }
}
