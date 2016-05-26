package Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class LinkedListMethods {
    public static int theNumberOfAttempts = 100;

    public double linkedListAddTime(int count, LinkedList<Integer> linkedList) {
        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        for (int j = 0; j < count; j++) {
            linkedList.add(j);
        }

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            linkedList.add(0);

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / theNumberOfAttempts;

        return averageTime;
    }

    public double linkedListGetTime(int count, LinkedList<Integer> linkedList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            for (int j = count; j < count + theNumberOfAttempts; j++ ) {
                int a = linkedList.get(j);
            }

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / theNumberOfAttempts;

        return averageTime;
    }

    public double linkedListContainsTime(int count, LinkedList<Integer> linkedList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        linkedList.add(0666);

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            linkedList.contains(0666);

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / theNumberOfAttempts;

        return averageTime;
    }

    double linkedListRemoveTime(int count, LinkedList<Integer> linkedList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            linkedList.remove(count - i);

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / theNumberOfAttempts;

        return averageTime;
    }

    double linkedListIteratorAddTime(int count, LinkedList<Integer> linkedList, ListIterator<Integer> listIterator) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            listIterator = linkedList.listIterator();

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / theNumberOfAttempts;

        return averageTime;
    }

    double linkedListIteratorRemoveTime(int count, LinkedList<Integer> linkedList, ListIterator<Integer> listIterator) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            listIterator = linkedList.listIterator();

            double startTime = System.nanoTime();

            while (!listIterator.hasNext()) {
                listIterator.remove();
            }

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / theNumberOfAttempts;

        return averageTime;
    }

    double linkedListPopulateTime (int count, LinkedList<Integer> linkedListList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            linkedListList.add(i);
        }

        for (int i = 0; i < theNumberOfAttempts; i++) {

            linkedList1.clear();

            double startTime = System.nanoTime();

            linkedList1 = linkedListList;

            double endTime = System.nanoTime();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / theNumberOfAttempts;

        return averageTime;
    }
}
