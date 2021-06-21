package MergeSort;

import java.util.Arrays;

public class MainMergeSort {

    public static void main(String[] args) {
        String[] a = new String[10];
        a[0] = "Zilda";
        a[1] = "Arilson";
        a[2] = "Bruno";
        a[3] = "Julia";
        a[4] = "Beatriz";
        a[5] = "Fernando";
        a[6] = "Leonardo";
        a[7] = "Francisco";
        a[8] = "Fabiana";
        a[9] = "Larissa";

        Ordenacao.mergeSort(0, a.length, a);
        System.out.println(Arrays.toString(a));
    }
}
