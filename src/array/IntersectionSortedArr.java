package array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSortedArr {

    // this is the brute force approach

    public static void main(String[] args) {
        int[] a1 = {1, 2, 2, 3, 5, 6};
        int[] a2 = {2, 2, 3, 3, 4, 5, 6, 6, 7};
        int n1 = a1.length;
        int n2 = a2.length;
        int[] visited = new int[n2];

        List<Integer> intersecion = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (a1[i] == a2[j] && visited[j] == 0){
                   intersecion.add(a1[i]);
                   visited[j] = 1;
                   break;
                }
                if (a2[j] > a1[i]){
                    break;
                }
            }
        }
        for(int x : intersecion){
            System.out.println(x);
        }
    }
}
