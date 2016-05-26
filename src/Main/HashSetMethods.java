package Main;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by 7 on 26.05.2016.
 */
public class HashSetMethods {
    public static int theNumberOfAttempts = 100;

    public double hashSetAddTime(int count, HashSet<Integer> hashSet) {
        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < count; i++) {
            hashSet.add(i);
        }

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            hashSet.add(i);

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


    public double hashSetListContainsTime(int count, HashSet<Integer> hashSetList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        hashSetList.add(0666);

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            hashSetList.contains(0666);

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

    double hashSetRemoveTime(int count, HashSet<Integer> hashSetList) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            hashSetList.remove(count - i);

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

    double hashSetPopulateTime (int count, HashSet<Integer> hashSet) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];
        HashSet<Integer> hashSet1 = new HashSet<>();

        for (int i = 0; i < count; i++) {
            hashSet.add(i);
        }

        for (int i = 0; i < theNumberOfAttempts; i++) {

            hashSet1.clear();

            double startTime = System.nanoTime();

            hashSet1 = hashSet;

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
