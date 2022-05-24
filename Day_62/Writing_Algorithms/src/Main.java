import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //bubble sort
        System.out.println("*****Bubble sort algorithm*****");
        int[] array = {4, 1, 3, 9, 7};
        System.out.println("Before bubble sort: ");
        for(int i : array) {
            System.out.print(i + ", ");
        }
        bubbleSort(array, array.length);
        System.out.println("\nAfter bubble sort: ");
        for(int i : array) {
            System.out.print(i + ", ");
        }

        //quick sort
        System.out.println("\n\n*****Quick sort algorithm*****");
        int[] array2 = {4, 1, 3, 9, 7};
        System.out.println("Before quick sort: ");
        for(int i : array2) {
            System.out.print(i + ", ");
        }
        quickSort(array2, 0, array.length-1);
        System.out.println("\nAfter quick sort: ");
        for(int i : array2) {
            System.out.print(i + ", ");
        }

        //search pattern
        System.out.println("\n");
        System.out.println("*****Search pattern algorithm*****");
        String s = "batmanandrobinarebat";
        String p1 = "bat";
        String p2 = "rat";
        searchPattern(s, p1);
        System.out.println();
        searchPattern(s, p2);
    }

    public static void bubbleSort(int[] arr, int n) {
        for(int i = 0; i < n-1; i++) {
            for(int j = 1; j < n-i; j++) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void searchPattern(String s, String p) {
        char[] string  = s.toCharArray();
        char[] pat = p.toCharArray();

        ArrayList<Integer> indexes = new ArrayList<Integer>();

        for(int i = 0; i < string.length; i++) {
            if(string[i] == pat[0]) {
                int count = 1;
                for(int j = 1; j < pat.length; j++) {
                    if(pat[j] == string[i+j]) {
                        count++;
                    }
                }
                if(count >= pat.length) {
                    indexes.add(i);
                }
            }
        }

        if(indexes.size() > 0) {
            System.out.print("The string '" + p + "' occurs " + indexes.size() + " time(s) inside of '" + s + "' at these indexes: ");
            for(int i = 0; i < indexes.size(); i++) {
                if(i == indexes.size()-1) {
                    System.out.print(indexes.get(i));
                } else {
                    System.out.print(indexes.get(i) + ", ");
                }
            }
        } else {
            System.out.println("The string '" + p + "' occurs " + indexes.size() + " times inside of '" + s + "'");
        }

    }

}
