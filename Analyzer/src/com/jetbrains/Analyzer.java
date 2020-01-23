package com.jetbrains;

public class Analyzer{

    public static int linearSearch(String[] dataSet, String element){
        int i;
        for(i=0; i < dataSet.length; ++i){
            if (dataSet[i].equals(element)){  // compares the given element to the array and returns its index
                return i;
            }

        }
        return -1; // element not found
    }

    public static int binarySearch(String[] dataSet, String element){
        int mid;
        int low;
        int high;

        low = 0;
        high = dataSet.length - 1;

        while (high >= low) {       // binary search where it splits the data set by half each time
            mid = (high + low) / 2;
            if (dataSet[mid].compareTo(element) < 0) {
                low = mid + 1;
            }
            else if (dataSet[mid].compareTo(element) > 0) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1; // not found
    }


    public static void main(String[] args){
        String[] dataSet = StringData.getData();
        long x = System.nanoTime();     // captures the begin time
        System.out.println(linearSearch(dataSet, "not_here"));
        long y = System.nanoTime();  // captures the end time
        System.out.println(y-x); // finds difference between start and end time to give total time
        System.out.println();

        x = System.nanoTime();
        System.out.println(binarySearch(dataSet, "not_here"));
        y = System.nanoTime();
        System.out.println(y-x);
        System.out.println();

         x = System.nanoTime();
        System.out.println(linearSearch(dataSet, "mzzzz"));
         y = System.nanoTime();
        System.out.println(y-x);
        System.out.println();

        x = System.nanoTime();
        System.out.println(binarySearch(dataSet, "mzzzz"));
        y = System.nanoTime();
        System.out.println(y-x);
        System.out.println();

         x = System.nanoTime();
        System.out.println(linearSearch(dataSet, "aaaaa"));
         y = System.nanoTime();
        System.out.println(y-x);
        System.out.println();

        x = System.nanoTime();
        System.out.println(binarySearch(dataSet, "aaaaa"));
        y = System.nanoTime();
        System.out.println(y-x);
    }

}