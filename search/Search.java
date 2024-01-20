package search;

public class Search {
    public static void main(String[] args) {
        int arr[] = {0, 4, 4, 2, 1, 8, 0, 5};
        for(int i = 0; i < arr.length; i++) {
            boolean isSwap = false;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwap = true;
                }
            }
            if(!isSwap) break;
            for(int x : arr) System.out.print(x + " ");
            System.out.println();
        }

    }

    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[j]; arr[j] = arr[i]; arr[i] = tmp;
    }
}
/*
* #Selection Sort: so sanh a[i] with a[j] => sort
* #Bubble Sort: compare a[j] with a[j + 1] => sort
* #Insertion Sort: compare key with value before, if satisfied -> sorted;
* */
