import java.util.Scanner;

public class FileSystem {
    public static void main(String[] args) {
        int[] x = new int[]{74, 29, 31, 4, 5, 11};
        String[] strArr = new String[]{"Harry", "Hermione", "Draco", "Ginny", "Albus"};

        Scanner scan = new Scanner(System.in);
        String search = scan.nextLine();

        //Q 01
        sortDescending(x);
        printArray(x);

        //Q 02
        sortAlphabetically(strArr);
        printStringArray(strArr);

        //Q 03
        searchStringArr(strArr, search);
        
        int myArray[] = new int[7];

        myArray[0] = 1254;
        myArray[1] = 1458;
        myArray[2] = 5687;
        myArray[3] = 1457;
        myArray[4] = 4554;
        myArray[5] = 5445;
        myArray[6] = 7524;
    
        System.out.println("Contents of the array: ");
        for(int i=0; i<myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void printStringArray(String[] arr) {
        for (String i : arr) {
            System.out.println(i);
        }
    }

    static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void sortAlphabetically(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].compareTo(strArr[j]) > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
    }

    static void searchStringArr(String[] arr, String search) {
        boolean contains = false;
        for (String s : arr) {
            if (s.equals(search)) {
                contains = true;
                break;
            }
        }
        if (!contains) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }
    }
}
