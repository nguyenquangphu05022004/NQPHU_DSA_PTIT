import java.util.*;

public class SlidingWindow {
    static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++) {
            if(!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(map.size());
        for(int i = k; i < n; i++) {
            if(map.get(A[i - k]) > 1) {
                map.put(A[i - k], map.get(A[i - 1]) - 1);
                if(map.containsKey(A[i])) {
                    map.put(A[i], map.get(A[i] + 1));
                } else {
                    map.put(A[i], 1);
                }
            } else {
                map.remove(A[i - k]);
                if(map.containsKey(A[i])) {
                    map.put(A[i], map.get(A[i] + 1));
                } else {
                    map.put(A[i], 1);
                }
            }
            list.add(map.size());
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        countDistinct(arr, n,k);
    }
}
