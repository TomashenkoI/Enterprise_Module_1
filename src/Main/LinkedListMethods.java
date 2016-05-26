package Main;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class LinkedListMethods {
    public static int theNumberOfAttempts = 100;

    public double arrayListAddTime(int count, LinkedList<Integer> linkedList) {
        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {
            linkedList.clear();

            double startTime = System.currentTimeMillis();

            for (int j = 0; j < count; j++) {
                linkedList.add(j);
            }

            double endTime = System.currentTimeMillis();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / 100;

        return averageTime;
    }

    public double arrayListGetTime (int count, LinkedList<Integer> linkedList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.currentTimeMillis();

            for (int j = 0; j < count; j++) {
                linkedList.get(j);
            }

            double endTime = System.currentTimeMillis();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / 100;

        return averageTime;
    }

    public double arrayListContainsTime (int count, LinkedList<Integer> linkedList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.currentTimeMillis();

            for (int j = 0; j < count; j++) {
                linkedList.contains(count);
            }

            double endTime = System.currentTimeMillis();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / 100;

        return averageTime;
    }

    double arrayListRemoveTime (int count, LinkedList<Integer> linkedList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.currentTimeMillis();

            while (!linkedList.isEmpty()) {
                linkedList.remove(0);
            }

            double endTime = System.currentTimeMillis();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / 100;

        return averageTime;
    }

    double arrayListIteratorAddTime (int count, LinkedList<Integer> linkedList, ListIterator<Integer> listIterator) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.currentTimeMillis();

            listIterator = linkedList.listIterator();

            double endTime = System.currentTimeMillis();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / 100;

        return averageTime;
    }

    double arrayListIteratorRemoveTime (int count, LinkedList<Integer> linkedList, ListIterator<Integer> listIterator) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            listIterator = linkedList.listIterator();

            double startTime = System.currentTimeMillis();

            while (!listIterator.hasNext()) {
                listIterator.remove();
            }

            double endTime = System.currentTimeMillis();

            double elapsedTime = endTime - startTime;

            usedTime[i] = elapsedTime;
        }

        for (int i = 0; i < usedTime.length; i++) {
            allElapsedTime += usedTime[i];
        }

        double averageTime = allElapsedTime / 100;

        return averageTime;
    }
}
