package cscc.edu;

public class Functions {

    public static void main(String[] args) {
        int [] x = {5,4,3,2,1,25,23,28,99,0,8};
        int [] y;
        y = mergeSort(x);
        for (int i = 0; i < x.length; i++)
            System.out.print( x[i] + " ");
        System.out.println();
        for (int i = 0; i < y.length; i++)
            System.out.print( y[i] + " ");
        System.out.println();

        int find = 0;
        int found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 1;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 2;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 3;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 4;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 5;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 23;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 25;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 28;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 99;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 8;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 100;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = -1;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 6;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 24;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 26;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 95;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
        find = 9;
        found = iBinarySearch(y,find);
        System.out.println("found " + find + " at: " + found);
    }
    public static class TwoArrays{
        int [] array1;
        int [] array2;

        public TwoArrays(int[] array1, int[] array2) {
            this.array1 = array1;
            this.array2 = array2;
        }
    }
    /**
     * public static int[] mergeSort(int[] data)
     * @param data integer array as input and sorts it.
     * @return sorted integer array
     */
    public static int[] mergeSort(int[] data){
        if (data.length == 1 || data.length == 0)
            return data;
        else {
            int [] a,b;
            a = mergeSort(splitArray(data).array1);
            b = mergeSort(splitArray(data).array2);
            TwoArrays smallerArray = new TwoArrays(a,b);
            return (merge(smallerArray));
        }
    }
    public static TwoArrays splitArray(int[] data) {
        // we are sure data.length is > 1
        int n = data.length;
        int halfArray = (n + 1)/2;
        int a [] = new int [halfArray];
        int b [] = new int [n - halfArray];
        System.arraycopy(data, 0, a, 0, halfArray);
        System.arraycopy(data, halfArray, b, 0, n-halfArray);
        TwoArrays outputArrays = new TwoArrays(a,b);
        return outputArrays;
    }
    private static int [] merge(TwoArrays data) {
        int firstArrayIndex = 0, secondArrayIndex = 0;
        int fullLength = data.array1.length + data.array2.length;
        int [] sortedArray = new int [fullLength];
        for (int i = 0; i < fullLength; i++){
            if (firstArrayIndex >= data.array1.length) {
                sortedArray[i] = data.array2[secondArrayIndex];
                secondArrayIndex++;
                continue;
            }
            if (secondArrayIndex >= data.array2.length) {
                sortedArray[i] = data.array1[firstArrayIndex];
                firstArrayIndex++;
                continue;
            }
            if (data.array1[firstArrayIndex] > data.array2[secondArrayIndex]) {
                sortedArray[i] = data.array2[secondArrayIndex];
                secondArrayIndex++;
            } else {
                sortedArray[i] = data.array1[firstArrayIndex];
                firstArrayIndex++;
            }
        } // end of for
        return sortedArray;
    }
    /**
     * public static int rBinarySearch(int[] data, int key)
     * Accepts an integer array and a key to search for and returns
     * the index of the key if it exists in the array, otherwise it
     * returns -1.
     * @param data
     * @param key
     * @return index or -1
     */
    public static int rBinarySearch(int[] data, int key){
        if (data.length == 0)
            return -1;
        if (data.length == 1 && data[0] == key)
            return 1;
        rBinarySearchHelper (int[] data, int key, int begIndex, int endIndex);
        return
    }

    /**
     * public static int iBinarySearch(int[] data, int key)
     * Accepts an integer array and a key to search for and returns
     * the index of the key if it exists in the array, otherwise it
     * returns -1.
     * @param data
     * @param key
     * @return index or -1
     */
    public static int iBinarySearch(int[] data, int key){
        int found = -1;
        int index = data.length/2;
        int begin = 0;
        int end = data.length - 1;
        if (data.length == 0)
            return -1;
        while (true) {
            if (key == data[index])
                return index;
            else
                if ((index == begin) || (index >= end))
                    break;
                else
                    if (begin == end)
                        break;
            if (key > data[index]) {
                begin = index;
                index = (begin + 1 + end) / 2;
            } else {
                end = index;
                index = (begin +end) /2;
            }
        }
        return found;
    }
}
