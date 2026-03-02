package array;

import java.util.ArrayList;
import java.util.List;

public class UnionSortedArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        List<Integer> unionArr = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i])
                    unionArr.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr2[j])
                    unionArr.add(arr2[j]);
                j++;
            } else {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i])
                    unionArr.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < n1) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i]) {
                unionArr.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr2[j]) {
                unionArr.add(arr2[j]);
            }
            j++;
        }
        // remaining element are should be added....------------------>>>>>>>
        for (int x : unionArr) {
            System.out.println(x);
        }

    }
}
