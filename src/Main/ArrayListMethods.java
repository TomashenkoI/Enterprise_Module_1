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

        for (int j = 0; j < count; j++) {
            arrayList.add(j);
        }

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            arrayList.add(0);

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

    public double arrayListGetTime (int count, ArrayList<Integer> arrayList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            for (int j = count; j < count + theNumberOfAttempts; j++) {
                arrayList.get(j);
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

    public double arrayListContainsTime (int count, ArrayList<Integer> arrayList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];
        arrayList.add(0666);

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            arrayList.contains(0666);

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

    double arrayListRemoveTime (int count, ArrayList<Integer> arrayList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            arrayList.remove(count - i);

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

    double arrayListIteratorAddTime (int count, ArrayList<Integer> arrayList, ListIterator<Integer> listIterator) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {
            listIterator = null;

            double startTime = System.nanoTime();

            listIterator = arrayList.listIterator();

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

    double arrayListIteratorRemoveTime (int count, ArrayList<Integer> arrayList, ListIterator<Integer> listIterator) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            listIterator = arrayList.listIterator();

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

    double arrayListPopulateTime (int count, ArrayList<Integer> arrayList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < theNumberOfAttempts; i++) {

            arrayList1.clear();

            double startTime = System.nanoTime();

            arrayList1 = arrayList;

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
