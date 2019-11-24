package cscc.edu;

public class Main {
    //public static void main(String[] args) {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        a = Functions.mergeSort(a);
        int idx = Functions.rBinarySearch(a, 4);
        int [] x = {5,4,3,2,1,25,23,28,99,0,8};
        int [] y;
        y = Functions.mergeSort(x);
        for (int i = 0; i < x.length; i++)
            System.out.print( x[i] + " ");
        System.out.println();
        for (int i = 0; i < y.length; i++)
            System.out.print( y[i] + " ");
        System.out.println();

        int find = 0;
        int found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 1;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 2;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 3;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 4;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 5;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 23;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 25;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 28;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 99;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 8;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 100;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = -1;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 6;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 24;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 26;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 95;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 9;
        found = Functions.rBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
    }
    // }
}
