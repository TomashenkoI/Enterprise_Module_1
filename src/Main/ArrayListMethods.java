package Main;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by 7 on 26.05.2016.
 */
public class ArrayListMethods {
    public static int theNumberOfAttempts = 100;

    public double arrayListAddTime(int count, ArrayList<Integer> arrayList) {
        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {
            arrayList.clear();

            double startTime = System.currentTimeMillis();

            for (int j = 0; j < count; j++) {
                arrayList.add(j);
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

    public double arrayListGetTime (int count, ArrayList<Integer> arrayList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.currentTimeMillis();

            for (int j = 0; j < count; j++) {
                arrayList.get(j);
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

    public double arrayListContainsTime (int count, ArrayList<Integer> arrayList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.currentTimeMillis();

            for (int j = 0; j < count; j++) {
                arrayList.contains(count);
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

    double arrayListRemoveTime (int count, ArrayList<Integer> arrayList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.currentTimeMillis();

            while (!arrayList.isEmpty()) {
                arrayList.remove(0);
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

    double arrayListIteratorAddTime (int count, ArrayList<Integer> arrayList, ListIterator<Integer> listIterator) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.currentTimeMillis();

            listIterator = arrayList.listIterator();

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

    double arrayListIteratorRemoveTime (int count, ArrayList<Integer> arrayList, ListIterator<Integer> listIterator) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            listIterator = arrayList.listIterator();

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
