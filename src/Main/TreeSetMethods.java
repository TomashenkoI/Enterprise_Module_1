package Main;

import java.util.TreeSet;

/**
 * Created by 7 on 26.05.2016.
 */
public class TreeSetMethods {
    public static int theNumberOfAttempts = 100;

    public double treeSetAddTime(int count, TreeSet<Integer> treeSet) {
        double allElapsedTime = 0;
        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < count; i++) {
            treeSet.add(i);
        }

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            treeSet.add(i);

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


    public double treeSetContainsTime(int count, TreeSet<Integer> treeSet) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        treeSet.add(0666);

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            treeSet.contains(0666);

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

    double treeSetRemoveTime(int count, TreeSet<Integer> treeSet) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];

        for (int i = 0; i < theNumberOfAttempts; i++) {

            double startTime = System.nanoTime();

            treeSet.remove(count - i);

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

    double treeSetPopulateTime(int count, TreeSet<Integer> treeSet) {
        double allElapsedTime = 0;

        double[] usedTime = new double[theNumberOfAttempts];
        TreeSet<Integer> treeSet1 = new TreeSet<>();

        for (int i = 0; i < count; i++) {
            treeSet.add(i);
        }

        for (int i = 0; i < theNumberOfAttempts; i++) {

            treeSet1.clear();

            double startTime = System.nanoTime();

            treeSet1 = treeSet;

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
