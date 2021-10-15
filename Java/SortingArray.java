public class SortingArray {
    public static void main(String[] args) {
        int i;
        int array[] = { 12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27 };
        System.out.print("Array elements before sorting: \n");
        for (i = 0; i < array.length; i++)
            System.out.println(array[i]);
        sortArray(array, array.length);
        System.out.print("Array elements after sorting: \n");
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void sortArray(int array[], int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            int a = array[i];
            while ((j > 0) && (array[j - 1] > a)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = a;
        }
    }
}